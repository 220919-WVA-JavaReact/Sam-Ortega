package com.revature.servlets;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.models.AppUser;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDateTime;

//Annotation based Registration
@WebServlet(
        urlPatterns = "/users",
        loadOnStartup = 2,
        initParams = {
                @WebInitParam(name = "user-servlet-key", value = "user-servlet-value"),
                @WebInitParam(name = "another-param", value = "another-value")
        })
public class UserServlet extends HttpServlet {
    // TODO what if the other servlets need an ObjectMapper? How do we share this reference across classes?
    private final ObjectMapper mapper;

    public UserServlet(ObjectMapper mapper){
        this.mapper = mapper;
    }

    @Override
    public void init() throws ServletException {
        System.out.println("[LOG] - UserServlet Instantiated!");
        System.out.println("[LOG] - Init param user-servlet-key: " + this.getServletConfig().getInitParameter("user-servlet-key"));
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("[LOG] - UserServlet received a GET request at " + LocalDateTime.now());
        // When we did our POST request before we basically parsed a JSON string into a java object now to do
        // the reverse proccess

        // Let's emulate a value that may come from some data source
        AppUser someUser = new AppUser(123, "Jane", "Doe", "email@email.com", "jDoe", "pass");

        //We want to convert this Java object into some sort of JSON string
        String resPayload = mapper.writeValueAsString(someUser);

        resp.setStatus(200);
        resp.setContentType("application/json");
        resp.getWriter().write(resPayload);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // POST requests are generally used for the creation of data in an application
        System.out.println("[LOG] - UserServlet received a POST request at " + LocalDateTime.now());

        // To print out from our input stream

        resp.setStatus(204);


        AppUser newUser = mapper.readValue(req.getInputStream(), AppUser.class);
        // At this point newUser could be sent to a service layer for validation which weould then send it to
        // the DAO layer to be created in the DB

        System.out.println(newUser);
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(req.getInputStream()));
//        String line;
//        while((line = bufferedReader.readLine()))
//
//        super.doPost(req, resp);
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPut(req, resp);
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doDelete(req, resp);
    }
}
