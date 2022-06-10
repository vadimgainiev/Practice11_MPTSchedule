package com.example.practice11_mptschedule;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<LessonsDay> lessonsDays = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setSchedule();

        RecyclerView recyclerView = findViewById(R.id.schedule);
        StateAdapter stateAdapter = new StateAdapter(this, lessonsDays);
        recyclerView.setAdapter(stateAdapter);
    }

    private void setSchedule(){
        lessonsDays.add(new LessonsDay (
                "Понедельник",
                "Нахимовский\n",
                ""));

        lessonsDays.add(new LessonsDay (
                "1",
                "-\n",
                ""));

        lessonsDays.add(new LessonsDay (
                "2",
                "Физическая культура\n",
                "А.В. Андрюков\n"));

        lessonsDays.add(new LessonsDay (
                "3",
                "Системное программирование\n",
                "А.Д. Нилов\n"));

        lessonsDays.add(new LessonsDay (
                "4",
                "Иностранный язык в профессиональной деятельности\n",
                "А.Д. Завьялова, А.Ю. Дымская\n"));

        lessonsDays.add(new LessonsDay (
                "5",
                "Поддержка и тестирование программных модулей\n",
                "М.А. Дюжева\n"));

        lessonsDays.add(new LessonsDay (
                "6",
                "-\n",
                ""));

        lessonsDays.add(new LessonsDay (
                "",
                "",
                ""));



        lessonsDays.add(new LessonsDay (
                "Вторник",
                "Нежинская\n",
                ""));

        lessonsDays.add(new LessonsDay (
                "1",
                "Теория вероятностей и математическая статистика\n",
                "Т.А. Санаева\n"));

        lessonsDays.add(new LessonsDay (
                "2",
                "Основы проектирования баз данных\n",
                "И.М. Щаников\n"));

        lessonsDays.add(new LessonsDay (
                "3",
                "Разработка программных модулей\n",
                "Н.А. Михайлин\n"));

        lessonsDays.add(new LessonsDay (
                "4",
                "Операционные системы и среды\n",
                "Д.В. Мысев\n"));

        lessonsDays.add(new LessonsDay (
                "5",
                "-\n",
                ""));

        lessonsDays.add(new LessonsDay (
                "6",
                "-\n",
                ""));

        lessonsDays.add(new LessonsDay (
                "",
                "",
                ""));



        lessonsDays.add(new LessonsDay (
                "Среда",
                "Нахимовский\n",
                ""));

        lessonsDays.add(new LessonsDay (
                "1",
                "Основы алгоритмизации и программирования\n",
                "М.А. Алешин\n"));

        lessonsDays.add(new LessonsDay (
                "2",
                "Системное программирование\nПоддержка и тестирование программных модулей\n",
                "А.Д. Нилов\nМ.А. Дюжева\n"));

        lessonsDays.add(new LessonsDay (
                "3",
                "Разработка мобильных приложений\n",
                "Р.Ю. Волков\n"));

        lessonsDays.add(new LessonsDay (
                "4",
                "-\n",
                ""));

        lessonsDays.add(new LessonsDay (
                "5",
                "-\n",
                ""));

        lessonsDays.add(new LessonsDay (
                "6",
                "-\n",
                ""));

        lessonsDays.add(new LessonsDay (
                "",
                "",
                ""));



        lessonsDays.add(new LessonsDay (
                "Четверг",
                "Нахимовский\n",
                ""));

        lessonsDays.add(new LessonsDay (
                "1",
                "-\n",
                ""));

        lessonsDays.add(new LessonsDay (
                "2",
                "Нет пары\nОсновы алгоритмизации и программирования\n",
                "-\nМ.А. Алешин\n"));

        lessonsDays.add(new LessonsDay (
                "3",
                "Основы алгоритмизации и программирования\n",
                "И.Д. Буканов\n"));

        lessonsDays.add(new LessonsDay (
                "4",
                "Разработка программных модулей\n",
                "Н.А. Михайлин\n"));

        lessonsDays.add(new LessonsDay (
                "5",
                "Элементы высшей математики\n",
                "М.В. Черемных\n"));

        lessonsDays.add(new LessonsDay (
                "6",
                "-\n",
                ""));

        lessonsDays.add(new LessonsDay (
                "",
                "",
                ""));



        lessonsDays.add(new LessonsDay (
                "Пятница",
                "Нахимовский\n",
                ""));

        lessonsDays.add(new LessonsDay (
                "1",
                "Основы проектирования баз данных\n",
                "И.М. Щаников\n"));

        lessonsDays.add(new LessonsDay (
                "2",
                "Компьютерные сети\n",
                "А.Д. Нилов\n"));

        lessonsDays.add(new LessonsDay (
                "3",
                "Основы алгоритмизации и программирования\nОперационные системы и среды\n",
                "И.Д. Буканов\nД.В. Мысев\n"));

        lessonsDays.add(new LessonsDay (
                "4",
                "Разработка мобильных приложений\nНет пары\n",
                "Р.Ю. Волков\n-\n"));

        lessonsDays.add(new LessonsDay (
                "5",
                "-\n",
                ""));

        lessonsDays.add(new LessonsDay (
                "6",
                "-\n",
                ""));

        lessonsDays.add(new LessonsDay (
                "",
                "",
                ""));

    }
}