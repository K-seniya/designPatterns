package behavioural.iterator;

import behavioural.iterator.model.BikeRepository;

import java.util.Iterator;

/**
 * Concepts
 * Traverse a container; doesn't expose underlying structure, decouples algorithms, sequential.
 *
 * Examples: java.util.Iterator, java.util.Enumeration
 *
 * Pitfalls:
 * no access to index, directional, speed/efficiency
 *
 * Contrast:
 * Iterator: interface based, no index, algorithm is removed, concurrent modification
 * For loop: traversal in client, exposes an index, doesn't change underlying object, syntax, typically slower
 *
 * Summary:
 * efficient way to traverse, hides algorithm, simplify client, foreach syntax
 */
public class Demo {

    public static void main(String[] args) {

        BikeRepository repository = new BikeRepository();

        repository.add("Cervelo");
        repository.add("Scott");
        repository.add("Fuji");

        Iterator<String> bikeIterator = repository.iterator();

        while (bikeIterator.hasNext()){
            System.out.println(bikeIterator.next());
        }

        for (String bike : repository) {
            System.out.println(bike);
        }


    }
}
