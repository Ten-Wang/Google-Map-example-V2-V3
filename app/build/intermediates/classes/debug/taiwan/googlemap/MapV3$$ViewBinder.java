// Generated code from Butter Knife. Do not modify!
package taiwan.googlemap;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class MapV3$$ViewBinder<T extends taiwan.googlemap.MapV3> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558550, "field 'webView'");
    target.webView = finder.castView(view, 2131558550, "field 'webView'");
  }

  @Override public void unbind(T target) {
    target.webView = null;
  }
}
