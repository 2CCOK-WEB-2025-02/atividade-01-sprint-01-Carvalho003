package school.sptech.sprint1_nota1.ex1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class ExercicioFacilController {

    @GetMapping("/ex-01/{palavra}")
    public Boolean exercicioFacil(@PathVariable String palavra) {
        String palavraMinuscula = palavra.toLowerCase();

        Integer tamanhoPalavra = palavra.length() - 1;
        Boolean palindromo = true;
        Integer indiceFinal = tamanhoPalavra;
        for(int i = 0; i < tamanhoPalavra / 2; i++){
            if(palavraMinuscula.charAt(i) != palavraMinuscula.charAt(indiceFinal)){
                palindromo = false;
            }
            indiceFinal--;
        }

        return palindromo;
    }
}
