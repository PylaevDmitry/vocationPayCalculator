package com.neoflex.school.vocationPayCalculator;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@SuppressWarnings("unused")
@RestController
@RequestMapping
public class PayController {
    @GetMapping(value = "/calculate")
    @ResponseBody
    public ResponseEntity<Pay> get(@RequestParam double avg, @RequestParam int n) {
        try {
            Pay pay = new Pay();
            pay.setPayValue(PayCalculator.calculate(avg,n));
            return new ResponseEntity<>(pay, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}
