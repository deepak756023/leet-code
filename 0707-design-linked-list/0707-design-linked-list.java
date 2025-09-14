class MyLinkedList {
    int val;
    MyLinkedList next;

    public MyLinkedList() {

    }

    public MyLinkedList(int val) {
        this.val = val;
    }

    public MyLinkedList(int val, MyLinkedList next) {
        this.val = val;
        this.next = next;

    }

    private MyLinkedList head;

    public int get(int index) {
        if (index < 0) {
            return -1;
        }

        int i = 0;
        var curr = head;

        while (curr != null && i < index) {
            curr = curr.next;
            i++;
        }
        if (curr == null) {
            return -1;
        }

        return curr.val;
    }

    public void addAtHead(int val) {
        var curr = new MyLinkedList(val);
        if (head == null) {
            head = curr;
            head.next = null;
        } else {
            curr.next = head;
            head = curr;

        }

    }

    public void addAtTail(int val) {
        var curr = new MyLinkedList(val);
        if (head == null) {
            head = curr;
        } else {
            var temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = curr;
            curr.next = null;
        }

    }

    public void addAtIndex(int index, int val) {
        if (index < 0) {
            return;
        }

        var curr = new MyLinkedList(val);

        if (index == 0) {
            curr.next = head;
            head = curr;
            return;
        }

        var prev = head;
        int count = 0;

        while (prev != null && count < index - 1) {
            prev = prev.next;
            count++;
        }

        if (prev == null) {
            return;
        }

        var next = prev.next;
        prev.next = curr;
        curr.next = next;
    }

    public void deleteAtIndex(int index) {
        if (head == null) {
            return;
        }
        if (index == 0) {
            var temp = head.next;
            head.next = null;
            head = temp;
            return;
        }

        var prev = head;
        int count = 0;

        //// Traverse to (index - 1)
        while (prev != null && count < index - 1) {
            prev = prev.next;
            count++;
        }

        if (prev == null || prev.next == null) {
            return;
        }

        var toDelete = prev.next;
        prev.next = toDelete.next;
        toDelete.next = null;
    }

}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */