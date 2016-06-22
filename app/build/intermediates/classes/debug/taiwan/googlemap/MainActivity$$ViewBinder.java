// Generated code from Butter Knife. Do not modify!
package taiwan.googlemap;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class MainActivity$$ViewBinder<T extends taiwan.googlemap.MainActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131558543, "field 'buttonV2' and method 'onClick'");
    target.buttonV2 = finder.castView(view, 2131558543, "field 'buttonV2'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
    view = finder.findRequiredView(source, 2131558545, "field 'buttonV3' and method 'onClick'");
    target.buttonV3 = finder.castView(view, 2131558545, "field 'buttonV3'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.onClick(p0);
        }
      });
  }

  @Override public void unbind(T target) {
    target.buttonV2 = null;
    target.buttonV3 = null;
  }
}
