package com.example.factorial;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
//@RequestMapping("api/factorial")
public class UserController {

    @GetMapping("/factorialOfN")

        public long fact(@RequestParam(value = "number", defaultValue = "0") long num)
        {
            long result = 1;
            if(num == 0)
            {
                return 1;
            }
            for(int i = 1; i <= num; i++)
            {
                result *= i;
            }
            return result;
        }
    @GetMapping("/factorialsTillN")
        public ArrayList<Long> factorials(@RequestParam(value="number", defaultValue = "0") long num)
        {
            ArrayList<Long> result_ =new ArrayList<>();
            long result=1;
            if(num == 0)
            {
                result_.add(1L);
                return result_;
            }
            for(int i = 1; i <= n; i++)
            {
                result*=i;
                result_.add(result);
            }
            return result_;
        }
}
