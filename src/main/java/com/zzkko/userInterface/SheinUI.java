package com.zzkko.userInterface;

import net.serenitybdd.screenplay.targets.Target;

public class SheinUI {

    public final Target BTN_PRODUCTOHOME = Target.the("Producto recomendado home").locatedBy("//android.widget.TextView[@content-desc='Precio $4.167']");
    public final Target BTN_ANADIRCARRITO = Target.the("Producto recomendado home").locatedBy("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.LinearLayout/android.widget.Button");
    public final Target BTN_CATEGORIA = Target.the("Buscar en categoria").locatedBy("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[5]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ImageView");
    public final Target BTN_SELECCIONARCATEGORIA = Target.the("Se selecciona categoria de compra").locatedBy("//*[contains(@text,'Pulseras')]");
    public final Target BTN_PRODUCTOCATEGORIA = Target.the("Producto seleccionado por categoria").locatedBy("//android.widget.TextView[@content-desc='Precio $12.500']");
    public final Target BTN_BARRABUSQUEDA = Target.the("Seleccionar barra de busqueda").locatedBy("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.FrameLayout[2]/android.view.ViewGroup/android.widget.ImageView[1]");
    public final Target TXT_PALABRAABUSCAR = Target.the("Texto a buscar").locatedBy("//*[contains(@text,'#SHEINX')]");
    public final Target BTN_HACERBUSQUEDA =Target.the("Buscar").locatedBy("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView");
    public final Target BTN_PRODUCTOBARRA = Target.the("Seleccionar producto desde la barra").locatedBy("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.view.ViewGroup");
    public final Target BTN_CARRITO = Target.the("Ingresar al carrito de compras").locatedBy("//android.widget.FrameLayout[@content-desc='Bolsa']/android.widget.ImageView");
    public final Target BTN_ELIMINARSELLECCIONCARRITO = Target.the("Eliminar seleccion del carrito").locatedBy("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout[1]");
    public final Target BTN_SELECCIONARTODOCARRITO = Target.the("Seleccionar todo el carrito").locatedBy("//*[contains(@text,'Todo')]");
    public final Target BTN_BORRARCARRITO = Target.the("Borrar contenido del carrito").locatedBy("//*[contains(@text,'Borrar')]");
}
