Step Tracker

Компания по производству спортивных носков решила разработать собственный счётчик калорий. Он будет дополнительно мотивировать покупателей вести здоровый образ жизни.

Функционал

Пользователь взаимодействует с приложением через консольный интерфейс, который позволяет произвести одновременно одно из действий по выбору:

ввести количество шагов за определённый день;
напечатать статистику за определённый месяц;
изменить цель по количеству шагов в день;
выйти из приложения.
После выбора и исполнения действия, программа позволяет пользователю ввести следующее действие. Программа завершается только при вводе пользователем команды выхода. При вводе несуществующей команды выводится сообщение о том, что такой команды нет, после чего приложение позволяет снова выбрать следующее действие.

В памяти приложения хранится следующая информация:

название месяца и данные о шагах пройденных в каждый день этого месяца. Для удобства подсчета принято, что в любом месяце 30 дней.
Вывод статистики за указанный пользователем месяц в формате:
1 день: 3000, 2 день: 2000, ..., 30 день: 10000

целевое количество шагов. При старте приложения устанавливается равным 10000.
Если за какой-то день статистика не сохранялась, то количество шагов в этот день становится равным 0.
общее количество шагов за месяц;
максимальное пройденное количество шагов в месяце;
среднее количество шагов;
пройденная дистанция (в км);
количество сожжённых килокалорий;
лучшая серия: максимальное количество подряд идущих дней, в течение которых количество шагов за день было равно или выше целевого.
