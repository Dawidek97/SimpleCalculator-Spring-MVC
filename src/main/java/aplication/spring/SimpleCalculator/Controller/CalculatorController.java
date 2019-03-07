package aplication.spring.SimpleCalculator.Controller;

import aplication.spring.SimpleCalculator.Models.SimpleCalculator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {


    SimpleCalculator simpleCalculator = new SimpleCalculator();

    @GetMapping("/index")
    public String calc(){
        return "index";
    }

    @GetMapping("/result")
    public String res(@RequestParam Integer a,
                      @RequestParam Integer b, ModelMap modelMap){
        int resultAdd = simpleCalculator.add(a,b);
        int resultSub = simpleCalculator.subtraction(a,b);
        int resultMul = simpleCalculator.multiplication(a,b);
        int resultDiv = simpleCalculator.division(a,b);
        modelMap.put("resultAdd", resultAdd);
        modelMap.put("resultSub", resultSub);
        modelMap.put("resultMul", resultMul);
        modelMap.put("resultDiv", resultDiv);

        return "result";

    }
}
