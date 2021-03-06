package com.saucelabs.simplesauce;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WindowsTest extends BaseConfigurationTest {
    @Test
    public void withWindows10_setsWindows10Platform() {
        sauceOptions.withWindows10();
        startSauceSession();
        String actualOsSetInConfig = sauce.getCurrentSessionCapabilities().getPlatform().toString();
        assertEquals("WIN10", actualOsSetInConfig);
    }
    @Test
    public void withWindows8_1_setsPlatformToWindows8_1() {
        sauceOptions.withWindows8_1();
        startSauceSession();
        String actualOsSetInConfig = sauce.getCurrentSessionCapabilities().getPlatform().toString();
        assertEquals("WIN8_1", actualOsSetInConfig);
    }
    @Test
    public void withWindows8_setsPlatformToWindows8() {
        sauceOptions.withWindows8();
        startSauceSession();
        String actualOsSetInConfig = sauce.getCurrentSessionCapabilities().getPlatform().toString();
        assertEquals("WIN8", actualOsSetInConfig);
    }
    @Test
    public void withWindows7_setsPlatformToWindows7() {
        sauceOptions.withWindows7();
        startSauceSession();
        String actualOsSetInConfig = sauce.getCurrentSessionCapabilities().getPlatform().toString();
        assertEquals("VISTA", actualOsSetInConfig);
    }
}
