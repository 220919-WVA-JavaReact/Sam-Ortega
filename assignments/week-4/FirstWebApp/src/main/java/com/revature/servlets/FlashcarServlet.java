package com.revature.servlets;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.revature.models.Flashcard;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//Annotation based Registration
@WebServlet(
        urlPatterns = "/flashcard",
        loadOnStartup = 2,
        initParams = {
                @WebInitParam(name = "flashcard-servlet-key", value = "flashcard-servlet-value"),
                @WebInitParam(name = "another-param", value = "another-value")
        })
public class FlashcarServlet extends HttpServlet {
    // This is bad practice since we need to create some sort of ObjectMapper object everytime we create a servlet
    private final ObjectMapper mapper = new ObjectMapper();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Pretend this value came from the database

        Flashcard card = new Flashcard(123, "what does oop stand for?", "object oriented programming");
        String respPayload = mapper.writeValueAsString(card);

        resp.setContentType("application/json");
        resp.getWriter().write(respPayload);
    }
}
