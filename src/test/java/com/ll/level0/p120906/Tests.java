package com.ll.level0.p120906;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

class Tests {

    @Test
    @DisplayName("1234 넣었을때의 값은 10")
    void v1(){

        assertThat(new Solution().solution(1234)).isEqualTo(10);

    }

    @Test
    @DisplayName("930211 넣었을때의 값은 16")
    void v2(){
        assertThat(new Solution().solution(930211)).isEqualTo(16);
    }


}