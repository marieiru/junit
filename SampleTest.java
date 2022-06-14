package com.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

class SampleTest {

    @Nested
    class getColor {
        @Test
        void success() {
            assertEquals("��", Sample.getColor(1));
            assertEquals("��", Sample.getColor(2));
            assertEquals("��", Sample.getColor(3));
        }

        @Test
        @DisplayName("�����G���[")
        void fail() {
            // ��O���������҂���B��O��������������ł���
            Throwable exception = assertThrows(RuntimeException.class, () -> {
                throw new RuntimeException("�����G���[");
            });
            assertEquals("�����G���[", Sample.getColor(99));
        }
        
    }
}
