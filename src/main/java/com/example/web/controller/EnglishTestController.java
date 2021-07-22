package com.example.web.controller;

import com.example.web.bean.EnglishTest;
import org.apache.catalina.LifecycleState;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EnglishTestController {


    @GetMapping(value = "/test")
    public List<EnglishTest> getTest() {
        return List.of(
                EnglishTest.builder()
                        .id(1L)
                        .question("q")
                        .firstAnswer("f")
                        .secondAnswer("s")
                        .thirdAnswer("th")
                        .fourthAnswer("fo")
                        .rightAnswer("r")
                        .build(),
                EnglishTest.builder()
                        .id(2L)
                        .question("q2")
                        .firstAnswer("f2")
                        .secondAnswer("s2")
                        .thirdAnswer("th2")
                        .fourthAnswer("fo2")
                        .rightAnswer("r2")
                        .build());
    }

   /* @GetMapping(value = "addTest")
    public ModelAndView addTestPage() {
        ModelAndView modelAndView = new ModelAndView("/addTest");
        return modelAndView;
    }

    @PostMapping(value = "addTest")
    public ModelAndView addTest(@RequestParam(value = "question") String question,
                                @RequestParam(value = "firstAnswer") String firstAnswer,
                                @RequestParam(value = "secondAnswer") String secondAnswer,
                                @RequestParam(value = "thirdAnswer") String thirdAnswer,
                                @RequestParam(value = "fourthAnswer") String fourthAnswer,
                                @RequestParam(value = "rightAnswer") String rightAnswer) {
        ModelAndView modelAndView = new ModelAndView("/addTest");
        QuestionAnswerTable newQuestion = QuestionAnswerTable.builder()
                .question(question)
                .firstAnswer(firstAnswer)
                .secondAnswer(secondAnswer)
                .thirdAnswer(thirdAnswer)
                .fourthAnswer(fourthAnswer)
                .rightAnswer(rightAnswer)
                .build();
        questionAnswerTableDaoWebService.addToDb(newQuestion);
        modelAndView.setViewName("redirect:/test");
        return modelAndView;

    }

    @GetMapping(value = "update" + "/{id}")
    public ModelAndView updateTestPage(@PathVariable(name = "id") Long id) {
        ModelAndView modelAndView = new ModelAndView("/updateTest");
        modelAndView.addObject("testList", questionAnswerTableDaoWebService.findById(id));
        return modelAndView;
    }

    @PostMapping(value = "update" + "/{id}")
    public ModelAndView updateTest(@PathVariable(name = "id") Long id,
                                   @RequestParam(value = "question") String question,
                                   @RequestParam(value = "firstAnswer") String firstAnswer,
                                   @RequestParam(value = "secondAnswer") String secondAnswer,
                                   @RequestParam(value = "thirdAnswer") String thirdAnswer,
                                   @RequestParam(value = "fourthAnswer") String fourthAnswer,
                                   @RequestParam(value = "rightAnswer") String rightAnswer) {
        ModelAndView modelAndView = new ModelAndView("/updateTest");
        questionAnswerTableDaoWebService.updateDataInTest(id, question, firstAnswer, secondAnswer, thirdAnswer,
                fourthAnswer, rightAnswer);
        modelAndView.setViewName("redirect:/test");
        return modelAndView;

    }

    @GetMapping(value = "delete" + "/{id}")
    public ModelAndView deleteTestPage(@PathVariable(name = "id") Long id) {
        ModelAndView modelAndView = new ModelAndView("/deleteTest");
        modelAndView.addObject("test", questionAnswerTableDaoWebService.findById(id));
        return modelAndView;
    }

    @PostMapping(value = "delete" + "/{id}")
    public ModelAndView deleteTest(@PathVariable(name = "id") Long id) {
        ModelAndView modelAndView = new ModelAndView("/deleteTest");
        questionAnswerTableDaoWebService.deleteById(id);
        modelAndView.setViewName("redirect:/test");
        return modelAndView;
    }*/
}
