package com.binarytree.model;

public class Obj extends ObjTree<Obj> {
    Integer myValue;

    public Obj(Integer value) {
        this.myValue = value;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((myValue == null) ? 0 : myValue.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Obj other = (Obj) obj;
        if (myValue == null) {
            if (other.myValue != null)
                return false;
        } else if (!myValue.equals(other.myValue))
            return false;
        return true;
    }

    @Override
    public int compareTo(Obj value) {
        int i = 0;

        if (this.myValue > value.myValue) {
            i = 1;
        } else if (this.myValue < value.myValue) {
            i = -1;
        }

        return i;
    }

    @Override
    public String toString() {
        return myValue.toString();
    }

    public int compareTo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }

    public String toString(Obj value) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'toString'");
    }

}
