# com.javarush.task.task06.task0603

По 50 000 объектов Cat и Dog

Создать в цикле по 50 000 объектов Cat и Dog.
(Java-машина должна начать уничтожать неиспользуемые, и метод finalize хоть раз да вызовется).
Требования:

    •
    В классе Cat должен быть void метод finalize.
    •
    В классе Dog должен быть void метод finalize.
    •
    Метод finalize класса Cat должен выводить на экран "A Cat was destroyed".
    •
    Метод finalize класса Dog должен выводить на экран "A Dog was destroyed".
    •
    Метод main должен создавать 50000 объектов типа Cat и 50000 объектов типа Dog.
