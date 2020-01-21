package com.heroku.teste.testeheroku;

import static java.lang.Math.random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TesteHerokuController {
@GetMapping("/victones/{texto}")
   public String testeHeroku(@PathVariable("texto") String texto){
    char[] textoTemp = texto.trim().toCharArray();
    int tamanho = textoTemp.length;
    boolean[] posCheia = new boolean[tamanho];
    StringBuilder result = new StringBuilder();

    for(int count = tamanho; count > 0;){
      int rand = (int) (random() * tamanho);
      if(!posCheia[rand]){
        posCheia[rand] = true;
        count--;
        result.append(textoTemp[rand]);
      }
    }

    return result.toString();
  }

}
