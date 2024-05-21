package Seminars_OOP.Seminar_2;

import java.util.List;

public interface MarketBehavoir {
    void acceptToMarket(Actor actor);// входит в магазин

    void releasedFromMarket(List<Actor> actorlist); //выходит из магазина

    void update();
}
