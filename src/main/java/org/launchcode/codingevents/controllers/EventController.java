package org.launchcode.codingevents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("events")
public class EventController {

    private static Map<String, String> events = new HashMap<>();

    @GetMapping
    public String displayAllEvents(Model model) {
       /* List<String> events = new ArrayList<>();
        events.add("Code With Pride");
        events.add("Strange Loop");
        events.add("Apple WWDC");
        events.add("SpringOne Platform");
        model.addAttribute("events",events);*/

        events.put("Hour of code", "Getting young minds interested in coding");
        events.put("StrangeLoop", "Coding conference for professionals sharing ideas");
        events.put("Apple WWDC", "Apple conference for professionals");
        model.addAttribute("events",events);
        return "events/index";
    }
}
