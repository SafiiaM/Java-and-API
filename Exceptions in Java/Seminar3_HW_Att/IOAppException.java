// Напишите приложение, которое будет запрашивать у пользователя следующие данные в произвольном порядке, разделенные пробелом:
//Фамилия Имя Отчество датарождения номертелефона пол
//
//Форматы данных:
//фамилия, имя, отчество - строки
//датарождения - строка формата dd.mm.yyyy
//номертелефона - целое беззнаковое число без форматирования
//пол - символ латиницей f или m.
//
//Приложение должно проверить введенные данные по количеству. Если количество не совпадает с требуемым, вернуть код ошибки,
// обработать его и показать пользователю сообщение, что он ввел меньше или больше данных, чем требуется.
//
//Приложение должно попытаться распарсить полученные значения и выделить из них требуемые параметры.
//Если форматы данных не совпадают, нужно бросить исключение, соответствующее типу проблемы. Можно использовать встроенные типы java и создать свои.
//Исключение должно быть корректно обработано, пользователю выведено сообщение с информацией, что именно неверно.
//
//Если всё введено и обработано верно, должен создаться файл с названием, равным фамилии, в него в одну строку должны записаться полученные данные, вида
// <Фамилия><Имя><Отчество><датарождения> <номертелефона><пол>
// Однофамильцы должны записаться в один и тот же файл, в отдельные строки.
//
//Не забудьте закрыть соединение с файлом.
//
//При возникновении проблемы с чтением-записью в файл, исключение должно быть корректно обработано, пользователь должен увидеть стектрейс ошибки.
//
//Данная промежуточная аттестация оценивается по системе "зачет" / "не зачет"
//
//"Зачет" ставится, если слушатель успешно выполнил
//"Незачет"" ставится, если слушатель успешно выполнил


package Seminar3_HW_Att;

import java.io.IOException;

public class IOAppException extends Exception {
        public IOAppException() {
            super("Ошибка ввода данных");
        }

        public IOAppException(String e) {
            super(e);
        }
    }

    class TooFewArguments extends IOAppException {
        public TooFewArguments() {
            super("Введено слишком мало аргументов");
        }
    }

    class TooManyArguments extends IOAppException {
        public TooManyArguments() {
            super("Введено слишком много аргументов");
        }
    }

    class NumberInFIOException extends IOAppException {
        public NumberInFIOException() {
            super("Ввод цифр в ФИО невозможен");
        }
    }

    class NotExistedDateValueError extends IOAppException {
        public NotExistedDateValueError(String e) {
            super(e);
        }

        public NotExistedDateValueError() {
            super("Ошибка ввода данных в поле 'Дата'");
        }
    }

    class SymbolsInPhoneException extends IOAppException {
        public SymbolsInPhoneException() {
            super("Ввод символов в номере телефона невозможен");
        }
    }

    class GenderError extends IOAppException {
        public GenderError() {
            super("Ошибка ввода пола");
        }
    }

    class FailedArgsInDateException extends NotExistedDateValueError {
        public FailedArgsInDateException() {
            super("Недостаточно аргументов в поле 'Дата'");
        }
    }

    class TooManyArgsInDateException extends NotExistedDateValueError {
        public TooManyArgsInDateException() {
            super("Лишние символы в поле 'Дата'");
        }
    }

    class DateNotValidException extends NotExistedDateValueError {
        public DateNotValidException() {
            super("Введена несуществующая дата");
        }

        public DateNotValidException(String e) {
            super(e);
        }
    }

    class DataWrite extends IOException {
        public DataWrite() {
            super("Ошибка записи файла");
        }

    }




