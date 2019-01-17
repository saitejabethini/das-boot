package com.boot;

import com.boot.controller.ShipWreckController;
import com.boot.model.Shipwreck;
import com.boot.repository.ShipwreckRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class ShipwreckControllerTest{

    @InjectMocks
    private ShipWreckController sc;


    @Mock
    private ShipwreckRepository shipwreckRepository;

    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);
    }
    @Test
    public void testShipwreckGet(){
        Shipwreck sw = new Shipwreck();
//        ShipWreckController sc = new ShipWreckController();
        sw.setId(1L);
        when(shipwreckRepository.findOne(1L)).thenReturn(sw);
        Shipwreck wreck = sc.get(1L);
        verify(shipwreckRepository).findOne(1l);
//        Assert.assertEquals(1L, wreck.getId().longValue());
    assertThat(wreck.getId(),is(1L));

    }
}

