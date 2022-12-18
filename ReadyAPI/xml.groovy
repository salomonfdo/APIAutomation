// How to declare namespaces
import com.eviware.soapui.support.XmlHolder
def holder = new XmlHolder(messageExchange.responseContentAsXml)
holder.namespaces["ns1"]='https://maps.googleapis.com/maps/api/place/textsearch/json';
//ns1:Response[1]/ns1:results[1]/ns1:e[1]/ns1:reference[1]

//ns1:Response[1]/ns1:results[1]/ns1:e[1]/ns1:reference[1]
 def actual=holder.getNodeValue("//ns1:Response[1]/ns1:results[1]/ns1:e[1]/ns1:id[1]")
 def ref=holder.getNodeValue("//ns1:Response[1]/ns1:results[1]/ns1:e[1]/ns1:reference[1]")
 context.getTestCase().setPropertyValue("reference",ref)
 def expected =context.getTestCase().getPropertyValue("ID")
assert actual==expected