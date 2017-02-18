package behavioural.visitor.model;

import java.util.Collections;
import java.util.List;

public class PartsOrder {

    private List<AtvPart> parts;

    public PartsOrder() {
    }

    public void addPart(AtvPart atvPart){
        parts.add(atvPart);
    }

    public List<AtvPart> getParts(){
        return Collections.unmodifiableList(parts);
    }

    public void accept(AtvPartVisitor visitor){
        for (AtvPart part : parts) {
            part.accept(visitor);
        }
        visitor.visit(this);

    }
}
