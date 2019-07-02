package com.github.eniomoura.ufg.cs.aula08.inteiro;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.io.IOException;


public class InteiroCLITest{

    @Test
    public void validacaoTest() throws IOException {
        InteiroCLI.main(new String[]{"C:/Users/Enio/cs-2019-01/aula-08/inteiro/target/classes/com/github/eniomoura/ufg/cs/aula08/inteiro/InteiroCLI.class"});
    }
}