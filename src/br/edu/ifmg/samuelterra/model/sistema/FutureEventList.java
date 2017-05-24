package br.edu.ifmg.samuelterra.model.sistema;

import br.edu.ifmg.samuelterra.model.events.Event;
import java.util.ArrayList;

/**
 * Created by dicus on 07/05/17.
 */
public class EventList {
    private ArrayList<Event> eventList;

    public EventList(){
        this.eventList = new ArrayList();
    }

    public Event getEvent(){
        return this.eventList.get(0);
    }

    public void addEvent(Event term){
        //this.eventList.add(event);


        if(this.eventList.size()==0){
            this.eventList.add(term);
        }
        else{
            int li = 0;
            int ls = this.eventList.size();
            int m;

            while(true){
                m =  Math.round((ls+li)/2);
                //System.out.printf("\n %d %d %d",li,ls,m);
                if(li==ls || Math.abs(ls-li)==1){
                    if(term.getOccurrenceTime()<this.eventList.get(m).getOccurrenceTime()){
                        this.eventList.add(m,term);
                    }
                    else if(term.getOccurrenceTime()>=this.eventList.get(m).getOccurrenceTime()){
                        this.eventList.add(m+1,term);
                    }
                    return;
                }
                if(term.getOccurrenceTime()<this.eventList.get(m).getOccurrenceTime()){
                    ls = m;
                }
                else if(term.getOccurrenceTime()>=this.eventList.get(m).getOccurrenceTime()){
                    //System.out.printf("\n ls win");
                    li = m;
                }
            }
        }
    }
}
