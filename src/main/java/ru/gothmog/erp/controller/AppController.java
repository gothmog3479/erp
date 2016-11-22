package ru.gothmog.erp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.gothmog.erp.model.By;
import ru.gothmog.erp.model.CreateTable;
import ru.gothmog.erp.model.Hello;
import ru.gothmog.erp.model.SelectFromTable;

@Controller
@ComponentScan("ru.gothmog.erp.model.By")
public class AppController {
    @Autowired
    Hello hello;
    @Autowired
    By by;
    @Autowired
    CreateTable createTable;
    @Autowired
    SelectFromTable selectFromTable;

    @RequestMapping("/")
    public String hello(Model model){
        model.addAttribute("hello", hello.getHelloMessage());
        model.addAttribute("by", by.getByMessage());
        return "hello";
    }

    @RequestMapping("/create")
    public String createTableCompany(Model model){
        model.addAttribute("create", createTable.tableCreation());
        return "create";
    }
    @RequestMapping("/select")
    public String selectFromTable(Model model){
        model.addAttribute("select", selectFromTable.selectRowsFromTableInArray() );
        return "select";
    }
}
