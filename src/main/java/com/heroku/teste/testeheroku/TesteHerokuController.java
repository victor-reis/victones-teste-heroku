package com.heroku.teste.testeheroku;

import static java.lang.Math.random;

import java.util.LinkedList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TesteHerokuController {
@GetMapping("/victones/{texto}")
   public String testeHeroku(@PathVariable("texto") String texto){

  List<Character> characterList = new LinkedList<>();
  for (int pos = 0; pos < texto.length();pos++) {
    characterList.add(texto.charAt(pos));
  }
  StringBuilder result = new StringBuilder();

  while (characterList.size()>0){
    int rand = (int) (random() * characterList.size());
    if(rand == characterList.size())rand--;
    result.append(characterList.remove(rand));
  }
  return result.toString();
  }

}
