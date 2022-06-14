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
            assertEquals("赤", Sample.getColor(1));
            assertEquals("緑", Sample.getColor(2));
            assertEquals("青", Sample.getColor(3));
        }

        @Test
        @DisplayName("引数エラー")
        void fail() {
            // 例外発生を期待する。例外発生後も処理ができる
            Throwable exception = assertThrows(RuntimeException.class, () -> {
                throw new RuntimeException("引数エラー");
            });
            assertEquals("引数エラー", Sample.getColor(99));
        }
        
    }
}
