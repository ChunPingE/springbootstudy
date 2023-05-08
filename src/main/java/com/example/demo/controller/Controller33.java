package com.example.demo.controller;

import java.io.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.*;

import jakarta.annotation.*;
import software.amazon.awssdk.auth.credentials.*;
import software.amazon.awssdk.awscore.exception.*;
import software.amazon.awssdk.core.exception.*;
import software.amazon.awssdk.core.sync.RequestBody;
import software.amazon.awssdk.regions.*;
import software.amazon.awssdk.services.s3.*;
import software.amazon.awssdk.services.s3.model.*;

@Controller
@RequestMapping("sub33")
public class Controller33 {

	@GetMapping("mylogin")
	public void loginForm() {
		
	}
}