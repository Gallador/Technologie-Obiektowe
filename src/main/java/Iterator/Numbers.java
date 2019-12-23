/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iterator;

/**
 *
 * @author mrmas
 
**/

class Numbers {
    public int num[] = {1, 2, 3};
    public Iterator getIterator() {
        return new NumbersIterator();
    }
    class NumbersIterator implements Iterator {
        int i;
        public boolean hasNext() {
            if (i < num.length) 
                return true;
            return false;
        }
        public Object next() {
            if (this.hasNext())
                return num[i++];
            return null;
        }
    }
}
