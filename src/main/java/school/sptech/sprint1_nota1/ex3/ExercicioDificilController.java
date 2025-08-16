package school.sptech.sprint1_nota1.ex3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ExercicioDificilController {

    @GetMapping("/ex-03/{n}")
    public ExercicioDificilResponse exercicioDificil(@PathVariable int n) {
        if(n <0){
            n = 0;
        }
        Integer fibonnaci = n;
        if(n >= 4){
            fibonnaci = fibonnaci(n);
        }

        Integer soma = 0;

        for(int i = 1; i <= n;i++){
            soma += fibonnaci(i);
        }

        ExercicioDificilResponse response = new ExercicioDificilResponse(
                fibonnaci,
                soma

        );
        return response;
    }

    public Integer fibonnaci(Integer termo){
        if( termo == 1){
            return 1;
        }else if(termo == 0){
            return 0;
        }

        Integer f1 = fibonnaci(termo-1);
        Integer f2 = fibonnaci(termo -2);

        return f1+f2;
    }


}
