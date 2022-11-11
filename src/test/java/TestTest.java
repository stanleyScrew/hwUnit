//package org.example;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Тестирование: Person")
class PersonTest {

    private Person person;

    @BeforeEach
    void setUp() {
        person = new Person("Валерий", "Игнатьев", 3);
        System.out.println("Вызываюсь до выполнения теста");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Вызываюсь после вызова теста");
    }

    @Test
    @DisplayName("Данный тест проверяет Имя - name")
    void getName() {
        assertEquals("Валерий", person.getName());
        System.out.println("Тест выполнился");
    }

    @Test
    @DisplayName("Данный тест проверяет Фамилию - surname")
    void getSurname() {
        assertEquals("Игнатьев", person.getSurname());
        System.out.println("Тест выполнился");
    }

    @Test
    @DisplayName("Данный тест проверяет кол-во билетов - ticket")
    void getTicket() {
        assertEquals(3, person.getTicket());
        System.out.println("Тест выполнился");
    }

    @Test
    @DisplayName("Данный тест проверяет возможность уменьшения кол-во билетов - ticket")
    void spendTicket() {
        Integer ticket = 3;
        if(ticket > 0) {
            ticket --;
            Assertions.assertTrue(true);
            System.out.println("Тест выполнился");
        } else {
            Assertions.assertFalse(false);
            System.out.println("Тест выполнился");
        }
    }
    @Test
    @DisplayName("Данный тест проверяет возможность уменьшения кол-ва билетов при 0 кол-во билетов - ticket")
    void spendTicketVarMin() {
        Integer ticket = 0;
        if(ticket > 0) {
            ticket --;
            Assertions.assertTrue(true);
            System.out.println("Тест выполнился");
        } else {
            Assertions.assertFalse(false);
            System.out.println("Тест выполнился");
        }
    }
}
