package consultation.consultation_03.code.classes;

public class Box <MyType>{

    private MyType item;

    public MyType getItem() {
        return item;
    }

    @Override
    public String toString() {
        return "Box{" +
                "item=" + item +
                '}';
    }

    /**
     * Рекомендации от Oracle для обозначения типов в дженериках:
     *
     * T - type, для обозначения параметра в произвольных классах
     *
     * N - number, для чисел
     *
     * E - element, для элементов параметризованных коллекций
     *
     * K - key, для ключей map-структур
     *
     * V - value, для значений map-структур
     *
     * S,U - применяют, когда дженерик-класс имеет несколько параметров
     */

}
