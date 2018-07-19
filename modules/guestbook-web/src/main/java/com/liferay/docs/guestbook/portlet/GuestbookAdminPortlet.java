package com.liferay.docs.guestbook.portlet;

import com.liferay.docs.guestbook.constants.GuestbookPortletKeys;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import org.osgi.service.component.annotations.Component;

import javax.portlet.Portlet;

@Component(
    immediate = true,
    property = {
        "com.liferay.portlet.display-category=category.hidden",
        "com.liferay.portlet.scopeable=true",
        "javax.portlet.display-name=Guestbooks",
        "javax.portlet.expiration-cache=0",
        "javax.portlet.init-param.portlet-title-based-navigation=true",
        "javax.portlet.init-param.template-path=/",
        "javax.portlet.init-param.view-template=/guestbookadminportlet/view.jsp",
        "javax.portlet.name=" + GuestbookPortletKeys.GUESTBOOK_ADMIN,
        "javax.portlet.resource-bundle=content.Language",
        "javax.portlet.security-role-ref=administrator",
        "javax.portlet.supports.mime-type=text/html",
        "com.liferay.portlet.add-default-resource=true"
    },
    service = Portlet.class
)

public class GuestbookAdminPortlet extends MVCPortlet {

}
