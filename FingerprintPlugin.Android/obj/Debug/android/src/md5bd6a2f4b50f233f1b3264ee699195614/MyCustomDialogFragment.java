package md5bd6a2f4b50f233f1b3264ee699195614;


public class MyCustomDialogFragment
	extends md5ed4ea6e8597c0787d7262465176419f0.FingerprintDialogFragment
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCreateView:(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;:GetOnCreateView_Landroid_view_LayoutInflater_Landroid_view_ViewGroup_Landroid_os_Bundle_Handler\n" +
			"";
		mono.android.Runtime.register ("FingerprintPlugin.Droid.MyCustomDialogFragment, FingerprintPlugin.Android, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", MyCustomDialogFragment.class, __md_methods);
	}


	public MyCustomDialogFragment () throws java.lang.Throwable
	{
		super ();
		if (getClass () == MyCustomDialogFragment.class)
			mono.android.TypeManager.Activate ("FingerprintPlugin.Droid.MyCustomDialogFragment, FingerprintPlugin.Android, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public android.view.View onCreateView (android.view.LayoutInflater p0, android.view.ViewGroup p1, android.os.Bundle p2)
	{
		return n_onCreateView (p0, p1, p2);
	}

	private native android.view.View n_onCreateView (android.view.LayoutInflater p0, android.view.ViewGroup p1, android.os.Bundle p2);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
