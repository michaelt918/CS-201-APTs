public class ListStretch {
    public ListNode stretch (ListNode list, int amount){
        // replace statement below with code you write
        if(list ==  null){
            return list;
        }
        ListNode ret = new ListNode(list.info, null);
        ListNode retStart = ret;
        while(list != null){
            for(int i = 0; i < amount; i++){
                ret.next = new ListNode(list.info, null);
                ret = ret.next;
            }
            list = list.next;
        }
        ret = retStart;
        return ret.next;
    }
}