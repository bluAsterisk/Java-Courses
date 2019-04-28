package Problem_01;

public class Pair<T extends Comparable <T>, S extends Comparable <S>> 
implements Comparable<Pair<T, S>>
{
    private T first;
    private S second;

    public Pair(T firstElement,S secondElement)
    {
        first = firstElement;
        second = secondElement;
    }
    public T getFirst(){return first;}
    public S getSecond(){return second;}
    @Override
    public int compareTo(Pair<T, S> o) {
        if (o.getFirst() == o.getFirst())
              return this.getSecond().compareTo(o.getSecond());
        else
            return this.first.compareTo(o.getFirst());
    }
}