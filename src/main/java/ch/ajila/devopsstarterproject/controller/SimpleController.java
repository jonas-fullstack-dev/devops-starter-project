package ch.ajila.devopsstarterproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;
import java.util.List;

/**
 * @author jfurrer
 */
@RestController
public class SimpleController {

    @GetMapping("/testURL")
    public String getUsers() {
        return "This is a test!";
    }
}


