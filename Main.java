// Домашнее задание на закрепление :

// 1) Создайте три класса: Человек, Кот, Робот, которые не наследуются от одного класса но есть общий класс родитель. 
// Эти классы должны уметь бегать и прыгать, все также с выводом информации о действии в консоль.
// 2) Создайте два класса: беговая дорожка и стена, при прохождении через которые, участники
// должны выполнять соответствующие действия (бежать или прыгать), результат выполнения
// печатаем в консоль (успешно пробежал, не смог пробежать и т.д.). У препятствий есть длина
// (для дорожки) или высота (для стены), а участников ограничения на бег и прыжки.
// 3) Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти
// этот набор препятствий. Если участник не смог пройти одно из препятствий, то дальше по
// списку он препятствий не идет.



package Task2;

public class Main {
    
    public static void main(String[] args) {

        Predok[] predokList = {
            new Robot(222, 3, "Robot1",0),
            new Robot(2, 1, "Robot2",0 ),
            new Human(123, 2, "Human1","men",0 ),
            new Human(123, 2, "Human2","woman",0 ),
            new Cat(12, 1, "Cat1","men",0 )
        
    };

        Way[] wayList = {new Treadmil(20, 0),
                    new Obstacle(0, 2),
                    new Treadmil(33, 0),
                    new Obstacle(0, 2)
                };

        for (Predok predok: predokList) {
            for (Way way : wayList) {
            predok.runmming(way.lenght);
            predok.jamping(way.height);     
            }

        }
        
    }
        
    }
