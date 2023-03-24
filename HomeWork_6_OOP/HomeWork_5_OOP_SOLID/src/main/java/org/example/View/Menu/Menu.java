package org.example.View.Menu;

/**
 * Класс ответственный за генерацию меню
 * Реализован принцип единственной ответственности:
 * Класс генерации отделён от класса, отвечающего за предоставление меню
 */
public class Menu implements AddMenuImpl{
    StringBuilder sb;

    public Menu() {
        this.sb = new StringBuilder();
    }

    @Override
    public String addMainMenu() {
        sb.setLength(0);
        sb.append("Главное меню:\n");
        sb.append("1.Добавить участника\n");
        sb.append("2.Добавить группу\n");
        sb.append("3.Посмотреть список участников\n");
        sb.append("4.Посмотреть группу\n");
        sb.append("0.Выйти\n\n");
        return sb.toString();
    }

    @Override
    public String addChoiceMember() {
        sb.setLength(0);
        sb.append("Выбор нового пользователя:\n");
        sb.append("1.Добавить студента\n");
        sb.append("2.Добавить преподавателя\n");
        sb.append("3.Добавить зав.кафедрой\n");
        sb.append("4.Добавить ректора\n");
        sb.append("0.Выйти\n\n");
        return sb.toString();
    }

    @Override
    public String addChoiceGroup() {
        sb.setLength(0);
        sb.append("Выбор Группы:\n");
        sb.append("1.Добавить учебную группу\n");
        sb.append("2.Добавить кафедру\n");
        sb.append("3.Добавить факультет\n");
        sb.append("0.Выйти\n\n");
        return sb.toString();
    }

    @Override
    public String addChoiceWhoseMember() {
        sb.setLength(0);
        sb.append("Какую группу хотите посмотреть:\n");
        sb.append("1.Студенты\n");
        sb.append("2.Преподаватели\n");
        sb.append("3.Зав.кафедрой\n");
        sb.append("4.Ректор\n");
        sb.append("0.Выйти\n\n");
        return sb.toString();
    }

    @Override
    public String addChoiceWhatsGroup() {
        sb.setLength(0);
        sb.append("Выбор Группы:\n");
        sb.append("1.Группа студентов\n");
        sb.append("2.Кафедра\n");
        sb.append("3.Факультет\n");
        sb.append("0.Выйти\n\n");
        return sb.toString();
    }

}
