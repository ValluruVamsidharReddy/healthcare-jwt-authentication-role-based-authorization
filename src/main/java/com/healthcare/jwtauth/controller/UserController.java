package com.healthcare.jwtauth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/api/user/profile")
    public String userProfile() {
        return "Welcome USER! You have successfully accessed your profile.";
    }

    @GetMapping("/api/admin/dashboard")
    public String adminDashboard() {
        return "Welcome ADMIN! You have successfully accessed the admin dashboard.";
    }
}