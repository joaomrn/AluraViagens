package br.com.alura.aluraviagens.util;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

import androidx.core.content.res.ResourcesCompat;

public class ResourceUtil {

    public static final String DRAWABLE = "drawable";

    public static Drawable devolveDrawable(Context context, String drawableEmTexto) {
        Resources resources = context.getResources();
        int idDoDrawable = resources.getIdentifier(drawableEmTexto
                , DRAWABLE, context.getPackageName());
        return resources.getDrawable(idDoDrawable);
    }

    public static Drawable devolveDrawable2(Context context, String drawableEmTexto) {
        Resources resources = context.getResources();
        int idDoDrawable = resources.getIdentifier(drawableEmTexto
                , DRAWABLE, context.getPackageName());
        return ResourcesCompat.getDrawable(resources, idDoDrawable, resources.newTheme());
    }
}
