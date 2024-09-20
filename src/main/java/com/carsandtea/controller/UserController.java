package com.carsandtea.controller;

import com.carsandtea.dto.Role;
import com.carsandtea.dto.UserTo;
import com.carsandtea.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Optional;

@Controller
@RequestMapping(value = UserController.REST_URL)
@RequiredArgsConstructor
public class UserController {

    public static final String REST_URL = "/user";

    private final UserService userService;

    @GetMapping(value = "/list")
    public String userList(Model model) {
        model.addAttribute("users", userService.getAll());
        return "user-list";
    }

    @GetMapping(value = "/edit")
    public String editUser(@RequestParam("id") Long id,
                           Model model) {

        Optional<UserTo> optionalUser = userService.get(id);
        optionalUser.ifPresent(userTo -> model.addAttribute("user", userTo));
        model.addAttribute("roles", Arrays.asList(Role.values()));
        return "edit-user";
    }

    @PostMapping("edit")
    public String editUser(@ModelAttribute("user") UserTo userTo) {
        userService.update(userTo);
        return "edit-user";
    }

}
