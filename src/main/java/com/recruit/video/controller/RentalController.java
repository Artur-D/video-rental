package com.recruit.video.controller;

import com.recruit.video.model.Rental;
import com.recruit.video.service.RentalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created on 03.06.14.
 */
@Controller
public class RentalController {

    @Autowired
    private RentalService rentalService;

    @RequestMapping(value = "/rent/{movieId}")
    public String rentMovie(@PathVariable("movieId") Integer movieId, Model model) {

        final int customerId = 2;
        Rental rental = rentalService.rentMovie(movieId, customerId, getStaffId());
        model.addAttribute("rental", rental);
        return "rental";

    }

    @RequestMapping(value = "/rental/{rentalId}", method = RequestMethod.GET)
    public String getRental(@PathVariable("rentalId") Integer rentalId, Model model) {
        Rental rental = rentalService.getRental(rentalId);
        model.addAttribute("rental", rental);
        return "rental";
    }

    private int getStaffId() {
        return 1;
    }

}

