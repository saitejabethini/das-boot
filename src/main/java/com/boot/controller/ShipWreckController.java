package com.boot.controller;


        import com.boot.model.Shipwreck;
        import org.springframework.web.bind.annotation.*;

        import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ShipWreckController {

    @RequestMapping(value = "shipwrecks", method = RequestMethod.GET)
    public List<Shipwreck> list()
    {
        return ShipwreckStub.list();
    }

    @RequestMapping(value = "shipwrecks", method = RequestMethod.POST)
    public Shipwreck create(@RequestBody Shipwreck Shipwreck) {
        return ShipwreckStub.create(Shipwreck);
    }


    @RequestMapping(value = "shipwrecks/{id}",method = RequestMethod.GET)
    public static Shipwreck get(@PathVariable Long id) {
        return ShipwreckStub.get(id);
    }

    @RequestMapping(value = "shipwrecks/{id}", method = RequestMethod.PUT)
    public static Shipwreck update(@PathVariable Long id, Shipwreck Shipwreck)
    {
        return ShipwreckStub.update(id,Shipwreck);
    }

    @RequestMapping(value = "shipwrecks/{id}", method = RequestMethod.DELETE)
    public static Shipwreck delete(@PathVariable Long id)
    {
        return ShipwreckStub.delete(id);
    }
}



