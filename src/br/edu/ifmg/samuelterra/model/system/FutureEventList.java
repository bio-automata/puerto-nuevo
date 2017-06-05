package br.edu.ifmg.samuelterra.model.system;

import br.edu.ifmg.samuelterra.model.events.Event;
import java.util.ArrayList;

/**
  FutureEventList

  This class is an abstraction of a ordered 
  event sequence. 

  Each event is inserted in chronologic order, 
  thus the immediate event is positioned in
  first cell of the list 

 */
public class FutureEventList {
    private ArrayList<Event> futureEventList;

    public FutureEventList(){
        this.futureEventList = new ArrayList();
    }

    public Event getEvent(){
        return this.futureEventList.get(0);
    }

    public void addEvent(Event term){
        if(this.futureEventList.size()==0){
            this.futureEventList.add(term);
        }
        else{
            int li = 0;
            int ls = this.futureEventList.size();
            int m;

            while(true){
                m =  Math.round((ls+li)/2);
                //System.out.printf("\n %d %d %d",li,ls,m);
                if(li==ls || Math.abs(ls-li)==1){
                    if(term.getOccurrenceTime()<this.futureEventList.get(m).getOccurrenceTime()){
                        this.futureEventList.add(m,term);
                    }
                    else if(term.getOccurrenceTime()>=this.futureEventList.get(m).getOccurrenceTime()){
                        this.futureEventList.add(m+1,term);
                    }
                    return;
                }
                if(term.getOccurrenceTime()<this.futureEventList.get(m).getOccurrenceTime()){
                    ls = m;
                }
                else if(term.getOccurrenceTime()>=this.futureEventList.get(m).getOccurrenceTime()){
                    //System.out.printf("\n ls win");
                    li = m;
                }
            }
        }
    }
}
