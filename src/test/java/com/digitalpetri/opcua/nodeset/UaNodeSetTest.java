package com.digitalpetri.opcua.nodeset;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import javax.xml.bind.JAXBException;

import org.eclipse.milo.opcua.sdk.server.api.Namespace;
import org.junit.Test;

public class UaNodeSetTest {

    @Test
    public void testParseNodeSet2() throws Exception {
        parse("Opc.Ua.NodeSet2.xml");
    }

    @Test
    public void testParseNodeSet2_Part3() throws Exception {
        parse("Opc.Ua.NodeSet2.Part3.xml");
    }

    @Test
    public void testParseNodeSet2_Part4() throws Exception {
        parse("Opc.Ua.NodeSet2.Part4.xml");
    }

    @Test
    public void testParseNodeSet2_Part5() throws Exception {
        parse("Opc.Ua.NodeSet2.Part5.xml");
    }

    @Test
    public void testParseNodeSet2_Part9() throws Exception {
        parse("Opc.Ua.NodeSet2.Part9.xml");
    }

    @Test
    public void testParseNodeSet2_Part10() throws Exception {
        parse("Opc.Ua.NodeSet2.Part10.xml");
    }

    @Test
    public void testParseNodeSet2_Part11() throws Exception {
        parse("Opc.Ua.NodeSet2.Part11.xml");
    }

    @Test
    public void testParseNodeSet2_Part13() throws Exception {
        parse("Opc.Ua.NodeSet2.Part13.xml");
    }

    @Test
    public void testParseAdiNodeSet() throws Exception {
        parse("adi/Opc.Ua.Adi.NodeSet2.xml");
    }

    @Test
    public void testParseAMLBaseTypes() throws Exception {
        parse("aml/Opc.Ua.AMLBaseTypes.NodeSet2.xml");
    }

    @Test
    public void testParseAMLLibraries() throws Exception {
        parse("aml/Opc.Ua.AMLLibraries.NodeSet2.xml");
    }

    @Test
    public void testParseAutoIdNodeSet() throws Exception {
        parse("autoid/Opc.Ua.AutoID.NodeSet2.xml");
    }

    @Test
    public void testParseDiNodeSet() throws Exception {
        parse("di/Opc.Ua.Di.NodeSet2.xml");
    }

    @Test
    public void testParseMdisNodeSet() throws Exception {
        parse("mdis/OPC.MDIS.NodeSet2.xml");
    }

    @Test
    public void testParsePlcNodeSet() throws Exception {
        parse("plc/Opc.Ua.Plc.NodeSet2.xml");
    }

    @Test
    public void testUmaticNodeSet() throws Exception {
        parse("export.xml");
        parse("umati.xml");
        parse("umati-example.xml");
        parse("isw-example.xml");


        UaNodeSet nodeSet = UaNodeSet.parse(new ByteArrayInputStream(getStringNodeSetXml().getBytes()));
        System.out.println(nodeSet.toString());
    }

    private void parse(String nodeSetFilename) throws JAXBException {
        InputStream nodeSetXml = getClass().getClassLoader().getResourceAsStream(nodeSetFilename);

        UaNodeSet nodeSet = UaNodeSet.parse(nodeSetXml);

        System.out.println("Parsed " + nodeSetFilename + " and generated " + nodeSet.getNodes().size() + " nodes.");
    }

    private String getStringNodeSetXml() {
        String nodeSetXml = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<UANodeSet xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:uax=\"http://opcfoundation.org/UA/2008/02/Types.xsd\" xmlns=\"http://opcfoundation.org/UA/2011/03/UANodeSet.xsd\" xmlns:s1=\"http://www.umati.info/example/Types.xsd\" xmlns:s2=\"http://www.umati.info/Types.xsd\" xmlns:ua=\"http://unifiedautomation.com/Configuration/NodeSet.xsd\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\">\n" +
                "    <NamespaceUris>\n" +
                "        <Uri>http://www.umati.info/example</Uri>\n" +
                "        <Uri>http://www.umati.info</Uri>\n" +
                "    </NamespaceUris>\n" +
                "    <Aliases>\n" +
                "        <Alias Alias=\"Boolean\">i=1</Alias>\n" +
                "        <Alias Alias=\"Int32\">i=6</Alias>\n" +
                "        <Alias Alias=\"UInt32\">i=7</Alias>\n" +
                "        <Alias Alias=\"Double\">i=11</Alias>\n" +
                "        <Alias Alias=\"String\">i=12</Alias>\n" +
                "        <Alias Alias=\"ByteString\">i=15</Alias>\n" +
                "        <Alias Alias=\"LocalizedText\">i=21</Alias>\n" +
                "        <Alias Alias=\"Organizes\">i=35</Alias>\n" +
                "        <Alias Alias=\"HasTypeDefinition\">i=40</Alias>\n" +
                "        <Alias Alias=\"GeneratesEvent\">i=41</Alias>\n" +
                "        <Alias Alias=\"HasProperty\">i=46</Alias>\n" +
                "        <Alias Alias=\"HasComponent\">i=47</Alias>\n" +
                "        <Alias Alias=\"UtcTime\">i=294</Alias>\n" +
                "        <Alias Alias=\"Range\">i=884</Alias>\n" +
                "        <Alias Alias=\"ChannelStateEnum\">ns=2;i=3004</Alias>\n" +
                "        <Alias Alias=\"SafetyModeEnum\">ns=2;i=3005</Alias>\n" +
                "        <Alias Alias=\"ControllerStateEnum\">ns=2;i=3006</Alias>\n" +
                "        <Alias Alias=\"LampColorEnum\">ns=2;i=3007</Alias>\n" +
                "        <Alias Alias=\"LampStatusEnum\">ns=2;i=3008</Alias>\n" +
                "        <Alias Alias=\"ControlModeEnum\">ns=2;i=3009</Alias>\n" +
                "    </Aliases>\n" +
                "    <Extensions>\n" +
                "        <Extension>\n" +
                "            <ua:ModelInfo Tool=\"UaModeler\" Hash=\"EXH3FeiPKg/INeeNKwtbWw==\" Version=\"1.6.2\"/>\n" +
                "        </Extension>\n" +
                "    </Extensions>\n" +
                "    <UAVariable SymbolicName=\"TypeDictionary_BinarySchema\" DataType=\"ByteString\" NodeId=\"ns=1;i=6069\" BrowseName=\"1:TypeDictionary\">\n" +
                "        <DisplayName>TypeDictionary</DisplayName>\n" +
                "        <Description>Collects the data type descriptions of http://www.umati.info/example</Description>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">i=72</Reference>\n" +
                "            <Reference ReferenceType=\"HasProperty\">ns=1;i=6072</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\" IsForward=\"false\">i=93</Reference>\n" +
                "        </References>\n" +
                "        <Value>\n" +
                "            <uax:ByteString>PG9wYzpUeXBlRGljdGlvbmFyeSB4bWxuczp4c2k9Imh0dHA6Ly93d3cudzMub3JnLzIwMDEvWE1MU2NoZ\n" +
                "                W1hLWluc3RhbmNlIiB4bWxuczp0bnM9Imh0dHA6Ly93d3cudW1hdGkuaW5mby9leGFtcGxlI\n" +
                "                iBEZWZhdWx0Qnl0ZU9yZGVyPSJMaXR0bGVFbmRpYW4iIHhtbG5zOm9wYz0iaHR0cDovL29wY\n" +
                "                2ZvdW5kYXRpb24ub3JnL0JpbmFyeVNjaGVtYS8iIHhtbG5zOnVhPSJodHRwOi8vb3BjZm91b\n" +
                "                mRhdGlvbi5vcmcvVUEvIiBUYXJnZXROYW1lc3BhY2U9Imh0dHA6Ly93d3cudW1hdGkuaW5mb\n" +
                "                y9leGFtcGxlIj4KIDxvcGM6SW1wb3J0IE5hbWVzcGFjZT0iaHR0cDovL29wY2ZvdW5kYXRpb\n" +
                "                24ub3JnL1VBLyIvPgo8L29wYzpUeXBlRGljdGlvbmFyeT4K</uax:ByteString>\n" +
                "        </Value>\n" +
                "    </UAVariable>\n" +
                "    <UAVariable DataType=\"String\" ParentNodeId=\"ns=1;i=6069\" NodeId=\"ns=1;i=6072\" BrowseName=\"NamespaceUri\">\n" +
                "        <DisplayName>NamespaceUri</DisplayName>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasProperty\" IsForward=\"false\">ns=1;i=6069</Reference>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">i=68</Reference>\n" +
                "        </References>\n" +
                "        <Value>\n" +
                "            <uax:String>http://www.umati.info/example</uax:String>\n" +
                "        </Value>\n" +
                "    </UAVariable>\n" +
                "    <UAVariable SymbolicName=\"TypeDictionary_XmlSchema\" DataType=\"ByteString\" NodeId=\"ns=1;i=6090\" BrowseName=\"1:TypeDictionary\">\n" +
                "        <DisplayName>TypeDictionary</DisplayName>\n" +
                "        <Description>Collects the data type descriptions of http://www.umati.info/example</Description>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">i=72</Reference>\n" +
                "            <Reference ReferenceType=\"HasProperty\">ns=1;i=6091</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\" IsForward=\"false\">i=92</Reference>\n" +
                "        </References>\n" +
                "        <Value>\n" +
                "            <uax:ByteString>PHhzOnNjaGVtYSBlbGVtZW50Rm9ybURlZmF1bHQ9InF1YWxpZmllZCIgdGFyZ2V0TmFtZXNwYWNlPSJod\n" +
                "                HRwOi8vd3d3LnVtYXRpLmluZm8vZXhhbXBsZS9UeXBlcy54c2QiIHhtbG5zOnRucz0iaHR0c\n" +
                "                DovL3d3dy51bWF0aS5pbmZvL2V4YW1wbGUvVHlwZXMueHNkIiB4bWxuczp1YT0iaHR0cDovL\n" +
                "                29wY2ZvdW5kYXRpb24ub3JnL1VBLzIwMDgvMDIvVHlwZXMueHNkIiB4bWxuczp4cz0iaHR0c\n" +
                "                DovL3d3dy53My5vcmcvMjAwMS9YTUxTY2hlbWEiPgogPHhzOmltcG9ydCBuYW1lc3BhY2U9I\n" +
                "                mh0dHA6Ly9vcGNmb3VuZGF0aW9uLm9yZy9VQS8yMDA4LzAyL1R5cGVzLnhzZCIvPgo8L3hzO\n" +
                "                nNjaGVtYT4K</uax:ByteString>\n" +
                "        </Value>\n" +
                "    </UAVariable>\n" +
                "    <UAVariable DataType=\"String\" ParentNodeId=\"ns=1;i=6090\" NodeId=\"ns=1;i=6091\" BrowseName=\"NamespaceUri\">\n" +
                "        <DisplayName>NamespaceUri</DisplayName>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasProperty\" IsForward=\"false\">ns=1;i=6090</Reference>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">i=68</Reference>\n" +
                "        </References>\n" +
                "        <Value>\n" +
                "            <uax:String>http://www.umati.info/example/Types.xsd</uax:String>\n" +
                "        </Value>\n" +
                "    </UAVariable>\n" +
                "    <UAObject EventNotifier=\"1\" NodeId=\"ns=1;i=5002\" BrowseName=\"1:MachineTool\">\n" +
                "        <DisplayName>MachineTool</DisplayName>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasComponent\">ns=1;i=5001</Reference>\n" +
                "            <Reference ReferenceType=\"Organizes\" IsForward=\"false\">ns=2;i=1000</Reference>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">ns=2;i=1014</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\">ns=1;i=5004</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\">ns=1;i=5030</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\">ns=1;i=5012</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\">ns=1;i=5022</Reference>\n" +
                "        </References>\n" +
                "    </UAObject>\n" +
                "    <UAObject ParentNodeId=\"ns=1;i=5002\" NodeId=\"ns=1;i=5001\" BrowseName=\"2:Identification\">\n" +
                "        <DisplayName>Identification</DisplayName>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasComponent\">ns=1;i=6001</Reference>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">ns=2;i=1021</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\">ns=1;i=6004</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\">ns=1;i=6005</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\">ns=1;i=6006</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\">ns=1;i=6002</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\">ns=1;i=6003</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\">ns=1;i=6007</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\">ns=1;i=5003</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\" IsForward=\"false\">ns=1;i=5002</Reference>\n" +
                "        </References>\n" +
                "    </UAObject>\n" +
                "    <UAVariable DataType=\"UInt32\" ParentNodeId=\"ns=1;i=5001\" NodeId=\"ns=1;i=6001\" BrowseName=\"2:BuildYear\" AccessLevel=\"3\">\n" +
                "        <DisplayName>BuildYear</DisplayName>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">i=63</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\" IsForward=\"false\">ns=1;i=5001</Reference>\n" +
                "        </References>\n" +
                "    </UAVariable>\n" +
                "    <UAVariable DataType=\"String\" ParentNodeId=\"ns=1;i=5001\" NodeId=\"ns=1;i=6004\" BrowseName=\"2:LocationMachine\" AccessLevel=\"3\">\n" +
                "        <DisplayName>LocationMachine</DisplayName>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">i=63</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\" IsForward=\"false\">ns=1;i=5001</Reference>\n" +
                "        </References>\n" +
                "    </UAVariable>\n" +
                "    <UAVariable DataType=\"String\" ParentNodeId=\"ns=1;i=5001\" NodeId=\"ns=1;i=6005\" BrowseName=\"2:LocationPlant\" AccessLevel=\"3\">\n" +
                "        <DisplayName>LocationPlant</DisplayName>\n" +
                "        <Description>Datatype needed</Description>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">i=63</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\" IsForward=\"false\">ns=1;i=5001</Reference>\n" +
                "        </References>\n" +
                "        <Value>\n" +
                "            <uax:String></uax:String>\n" +
                "        </Value>\n" +
                "    </UAVariable>\n" +
                "    <UAVariable DataType=\"String\" ParentNodeId=\"ns=1;i=5001\" NodeId=\"ns=1;i=6006\" BrowseName=\"2:Manufacturer\" AccessLevel=\"3\">\n" +
                "        <DisplayName>Manufacturer</DisplayName>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">i=63</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\" IsForward=\"false\">ns=1;i=5001</Reference>\n" +
                "        </References>\n" +
                "    </UAVariable>\n" +
                "    <UAVariable DataType=\"String\" ParentNodeId=\"ns=1;i=5001\" NodeId=\"ns=1;i=6002\" BrowseName=\"2:NameCatalog\" AccessLevel=\"3\">\n" +
                "        <DisplayName>NameCatalog</DisplayName>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">i=63</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\" IsForward=\"false\">ns=1;i=5001</Reference>\n" +
                "        </References>\n" +
                "    </UAVariable>\n" +
                "    <UAVariable DataType=\"String\" ParentNodeId=\"ns=1;i=5001\" NodeId=\"ns=1;i=6003\" BrowseName=\"2:NameCustom\" AccessLevel=\"3\">\n" +
                "        <DisplayName>NameCustom</DisplayName>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">i=63</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\" IsForward=\"false\">ns=1;i=5001</Reference>\n" +
                "        </References>\n" +
                "    </UAVariable>\n" +
                "    <UAVariable DataType=\"String\" ParentNodeId=\"ns=1;i=5001\" NodeId=\"ns=1;i=6007\" BrowseName=\"2:SerialNumber\" AccessLevel=\"3\">\n" +
                "        <DisplayName>SerialNumber</DisplayName>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">i=63</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\" IsForward=\"false\">ns=1;i=5001</Reference>\n" +
                "        </References>\n" +
                "    </UAVariable>\n" +
                "    <UAObject ParentNodeId=\"ns=1;i=5001\" NodeId=\"ns=1;i=5003\" BrowseName=\"2:SoftwareVersions\">\n" +
                "        <DisplayName>SoftwareVersions</DisplayName>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasComponent\">ns=1;i=6008</Reference>\n" +
                "            <Reference ReferenceType=\"HasProperty\">ns=1;i=6009</Reference>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">ns=2;i=1022</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\" IsForward=\"false\">ns=1;i=5001</Reference>\n" +
                "        </References>\n" +
                "    </UAObject>\n" +
                "    <UAVariable DataType=\"String\" ParentNodeId=\"ns=1;i=5003\" NodeId=\"ns=1;i=6008\" BrowseName=\"2:ComponentVersion\" AccessLevel=\"3\">\n" +
                "        <DisplayName>ComponentVersion</DisplayName>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">i=63</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\" IsForward=\"false\">ns=1;i=5003</Reference>\n" +
                "        </References>\n" +
                "    </UAVariable>\n" +
                "    <UAVariable DataType=\"String\" ParentNodeId=\"ns=1;i=5003\" NodeId=\"ns=1;i=6009\" BrowseName=\"2:Identifier\" AccessLevel=\"3\">\n" +
                "        <DisplayName>Identifier</DisplayName>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasProperty\" IsForward=\"false\">ns=1;i=5003</Reference>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">i=68</Reference>\n" +
                "        </References>\n" +
                "    </UAVariable>\n" +
                "    <UAObject ParentNodeId=\"ns=1;i=5002\" NodeId=\"ns=1;i=5004\" BrowseName=\"2:Monitoring\">\n" +
                "        <DisplayName>Monitoring</DisplayName>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasComponent\" IsForward=\"false\">ns=1;i=5002</Reference>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">ns=2;i=1016</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\">ns=1;i=5005</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\">ns=1;i=5007</Reference>\n" +
                "        </References>\n" +
                "    </UAObject>\n" +
                "    <UAObject ParentNodeId=\"ns=1;i=5004\" NodeId=\"ns=1;i=5005\" BrowseName=\"2:Stacklight\">\n" +
                "        <DisplayName>Stacklight</DisplayName>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasComponent\">ns=1;i=5015</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\">ns=1;i=5006</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\">ns=1;i=5016</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\">ns=1;i=5027</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\">ns=1;i=5028</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\">ns=1;i=5029</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\" IsForward=\"false\">ns=1;i=5004</Reference>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">ns=2;i=1040</Reference>\n" +
                "        </References>\n" +
                "    </UAObject>\n" +
                "    <UAObject ParentNodeId=\"ns=1;i=5005\" NodeId=\"ns=1;i=5015\" BrowseName=\"2:Lamp1\">\n" +
                "        <DisplayName>Lamp1</DisplayName>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasProperty\">ns=1;i=6014</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\" IsForward=\"false\">ns=1;i=5005</Reference>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">ns=2;i=1041</Reference>\n" +
                "            <Reference ReferenceType=\"HasProperty\">ns=1;i=6087</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\">ns=1;i=6015</Reference>\n" +
                "        </References>\n" +
                "    </UAObject>\n" +
                "    <UAVariable DataType=\"LampColorEnum\" ParentNodeId=\"ns=1;i=5015\" NodeId=\"ns=1;i=6014\" BrowseName=\"2:Color\" AccessLevel=\"3\">\n" +
                "        <DisplayName>Color</DisplayName>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasProperty\" IsForward=\"false\">ns=1;i=5015</Reference>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">i=68</Reference>\n" +
                "        </References>\n" +
                "    </UAVariable>\n" +
                "    <UAVariable DataType=\"UInt32\" ParentNodeId=\"ns=1;i=5015\" NodeId=\"ns=1;i=6087\" BrowseName=\"2:NumberInList\" AccessLevel=\"3\">\n" +
                "        <DisplayName>NumberInList</DisplayName>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasProperty\" IsForward=\"false\">ns=1;i=5015</Reference>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">i=68</Reference>\n" +
                "        </References>\n" +
                "        <Value>\n" +
                "            <uax:UInt32>1</uax:UInt32>\n" +
                "        </Value>\n" +
                "    </UAVariable>\n" +
                "    <UAVariable DataType=\"LampStatusEnum\" ParentNodeId=\"ns=1;i=5015\" NodeId=\"ns=1;i=6015\" BrowseName=\"2:Status\" AccessLevel=\"3\">\n" +
                "        <DisplayName>Status</DisplayName>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">i=63</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\" IsForward=\"false\">ns=1;i=5015</Reference>\n" +
                "        </References>\n" +
                "    </UAVariable>\n" +
                "    <UAObject ParentNodeId=\"ns=1;i=5005\" NodeId=\"ns=1;i=5006\" BrowseName=\"1:Lamp2\">\n" +
                "        <DisplayName>Lamp2</DisplayName>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasProperty\">ns=1;i=6010</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\" IsForward=\"false\">ns=1;i=5005</Reference>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">ns=2;i=1041</Reference>\n" +
                "            <Reference ReferenceType=\"HasProperty\">ns=1;i=6077</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\">ns=1;i=6011</Reference>\n" +
                "        </References>\n" +
                "    </UAObject>\n" +
                "    <UAVariable DataType=\"LampColorEnum\" ParentNodeId=\"ns=1;i=5006\" NodeId=\"ns=1;i=6010\" BrowseName=\"2:Color\" AccessLevel=\"3\">\n" +
                "        <DisplayName>Color</DisplayName>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasProperty\" IsForward=\"false\">ns=1;i=5006</Reference>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">i=68</Reference>\n" +
                "        </References>\n" +
                "    </UAVariable>\n" +
                "    <UAVariable DataType=\"UInt32\" ParentNodeId=\"ns=1;i=5006\" NodeId=\"ns=1;i=6077\" BrowseName=\"2:NumberInList\" AccessLevel=\"3\">\n" +
                "        <DisplayName>NumberInList</DisplayName>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasProperty\" IsForward=\"false\">ns=1;i=5006</Reference>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">i=68</Reference>\n" +
                "        </References>\n" +
                "        <Value>\n" +
                "            <uax:UInt32>2</uax:UInt32>\n" +
                "        </Value>\n" +
                "    </UAVariable>\n" +
                "    <UAVariable DataType=\"LampStatusEnum\" ParentNodeId=\"ns=1;i=5006\" NodeId=\"ns=1;i=6011\" BrowseName=\"2:Status\" AccessLevel=\"3\">\n" +
                "        <DisplayName>Status</DisplayName>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">i=63</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\" IsForward=\"false\">ns=1;i=5006</Reference>\n" +
                "        </References>\n" +
                "    </UAVariable>\n" +
                "    <UAObject ParentNodeId=\"ns=1;i=5005\" NodeId=\"ns=1;i=5016\" BrowseName=\"1:Lamp3\">\n" +
                "        <DisplayName>Lamp3</DisplayName>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasProperty\">ns=1;i=6016</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\" IsForward=\"false\">ns=1;i=5005</Reference>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">ns=2;i=1041</Reference>\n" +
                "            <Reference ReferenceType=\"HasProperty\">ns=1;i=6078</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\">ns=1;i=6017</Reference>\n" +
                "        </References>\n" +
                "    </UAObject>\n" +
                "    <UAVariable DataType=\"LampColorEnum\" ParentNodeId=\"ns=1;i=5016\" NodeId=\"ns=1;i=6016\" BrowseName=\"2:Color\" AccessLevel=\"3\">\n" +
                "        <DisplayName>Color</DisplayName>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasProperty\" IsForward=\"false\">ns=1;i=5016</Reference>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">i=68</Reference>\n" +
                "        </References>\n" +
                "    </UAVariable>\n" +
                "    <UAVariable DataType=\"UInt32\" ParentNodeId=\"ns=1;i=5016\" NodeId=\"ns=1;i=6078\" BrowseName=\"2:NumberInList\" AccessLevel=\"3\">\n" +
                "        <DisplayName>NumberInList</DisplayName>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasProperty\" IsForward=\"false\">ns=1;i=5016</Reference>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">i=68</Reference>\n" +
                "        </References>\n" +
                "        <Value>\n" +
                "            <uax:UInt32>3</uax:UInt32>\n" +
                "        </Value>\n" +
                "    </UAVariable>\n" +
                "    <UAVariable DataType=\"LampStatusEnum\" ParentNodeId=\"ns=1;i=5016\" NodeId=\"ns=1;i=6017\" BrowseName=\"2:Status\" AccessLevel=\"3\">\n" +
                "        <DisplayName>Status</DisplayName>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">i=63</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\" IsForward=\"false\">ns=1;i=5016</Reference>\n" +
                "        </References>\n" +
                "    </UAVariable>\n" +
                "    <UAObject ParentNodeId=\"ns=1;i=5005\" NodeId=\"ns=1;i=5027\" BrowseName=\"1:Lamp4\">\n" +
                "        <DisplayName>Lamp4</DisplayName>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasProperty\">ns=1;i=6028</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\" IsForward=\"false\">ns=1;i=5005</Reference>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">ns=2;i=1041</Reference>\n" +
                "            <Reference ReferenceType=\"HasProperty\">ns=1;i=6079</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\">ns=1;i=6071</Reference>\n" +
                "        </References>\n" +
                "    </UAObject>\n" +
                "    <UAVariable DataType=\"LampColorEnum\" ParentNodeId=\"ns=1;i=5027\" NodeId=\"ns=1;i=6028\" BrowseName=\"2:Color\" AccessLevel=\"3\">\n" +
                "        <DisplayName>Color</DisplayName>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasProperty\" IsForward=\"false\">ns=1;i=5027</Reference>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">i=68</Reference>\n" +
                "        </References>\n" +
                "    </UAVariable>\n" +
                "    <UAVariable DataType=\"UInt32\" ParentNodeId=\"ns=1;i=5027\" NodeId=\"ns=1;i=6079\" BrowseName=\"2:NumberInList\" AccessLevel=\"3\">\n" +
                "        <DisplayName>NumberInList</DisplayName>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasProperty\" IsForward=\"false\">ns=1;i=5027</Reference>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">i=68</Reference>\n" +
                "        </References>\n" +
                "        <Value>\n" +
                "            <uax:UInt32>4</uax:UInt32>\n" +
                "        </Value>\n" +
                "    </UAVariable>\n" +
                "    <UAVariable DataType=\"LampStatusEnum\" ParentNodeId=\"ns=1;i=5027\" NodeId=\"ns=1;i=6071\" BrowseName=\"2:Status\" AccessLevel=\"3\">\n" +
                "        <DisplayName>Status</DisplayName>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">i=63</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\" IsForward=\"false\">ns=1;i=5027</Reference>\n" +
                "        </References>\n" +
                "    </UAVariable>\n" +
                "    <UAObject ParentNodeId=\"ns=1;i=5005\" NodeId=\"ns=1;i=5028\" BrowseName=\"1:Lamp5\">\n" +
                "        <DisplayName>Lamp5</DisplayName>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasProperty\">ns=1;i=6073</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\" IsForward=\"false\">ns=1;i=5005</Reference>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">ns=2;i=1041</Reference>\n" +
                "            <Reference ReferenceType=\"HasProperty\">ns=1;i=6080</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\">ns=1;i=6074</Reference>\n" +
                "        </References>\n" +
                "    </UAObject>\n" +
                "    <UAVariable DataType=\"LampColorEnum\" ParentNodeId=\"ns=1;i=5028\" NodeId=\"ns=1;i=6073\" BrowseName=\"2:Color\" AccessLevel=\"3\">\n" +
                "        <DisplayName>Color</DisplayName>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasProperty\" IsForward=\"false\">ns=1;i=5028</Reference>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">i=68</Reference>\n" +
                "        </References>\n" +
                "    </UAVariable>\n" +
                "    <UAVariable DataType=\"UInt32\" ParentNodeId=\"ns=1;i=5028\" NodeId=\"ns=1;i=6080\" BrowseName=\"2:NumberInList\" AccessLevel=\"3\">\n" +
                "        <DisplayName>NumberInList</DisplayName>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasProperty\" IsForward=\"false\">ns=1;i=5028</Reference>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">i=68</Reference>\n" +
                "        </References>\n" +
                "        <Value>\n" +
                "            <uax:UInt32>5</uax:UInt32>\n" +
                "        </Value>\n" +
                "    </UAVariable>\n" +
                "    <UAVariable DataType=\"LampStatusEnum\" ParentNodeId=\"ns=1;i=5028\" NodeId=\"ns=1;i=6074\" BrowseName=\"2:Status\" AccessLevel=\"3\">\n" +
                "        <DisplayName>Status</DisplayName>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">i=63</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\" IsForward=\"false\">ns=1;i=5028</Reference>\n" +
                "        </References>\n" +
                "    </UAVariable>\n" +
                "    <UAObject ParentNodeId=\"ns=1;i=5005\" NodeId=\"ns=1;i=5029\" BrowseName=\"1:Lamp6\">\n" +
                "        <DisplayName>Lamp6</DisplayName>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasProperty\">ns=1;i=6075</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\" IsForward=\"false\">ns=1;i=5005</Reference>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">ns=2;i=1041</Reference>\n" +
                "            <Reference ReferenceType=\"HasProperty\">ns=1;i=6081</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\">ns=1;i=6076</Reference>\n" +
                "        </References>\n" +
                "    </UAObject>\n" +
                "    <UAVariable DataType=\"LampColorEnum\" ParentNodeId=\"ns=1;i=5029\" NodeId=\"ns=1;i=6075\" BrowseName=\"2:Color\" AccessLevel=\"3\">\n" +
                "        <DisplayName>Color</DisplayName>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasProperty\" IsForward=\"false\">ns=1;i=5029</Reference>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">i=68</Reference>\n" +
                "        </References>\n" +
                "    </UAVariable>\n" +
                "    <UAVariable DataType=\"UInt32\" ParentNodeId=\"ns=1;i=5029\" NodeId=\"ns=1;i=6081\" BrowseName=\"2:NumberInList\" AccessLevel=\"3\">\n" +
                "        <DisplayName>NumberInList</DisplayName>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasProperty\" IsForward=\"false\">ns=1;i=5029</Reference>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">i=68</Reference>\n" +
                "        </References>\n" +
                "        <Value>\n" +
                "            <uax:UInt32>6</uax:UInt32>\n" +
                "        </Value>\n" +
                "    </UAVariable>\n" +
                "    <UAVariable DataType=\"LampStatusEnum\" ParentNodeId=\"ns=1;i=5029\" NodeId=\"ns=1;i=6076\" BrowseName=\"2:Status\" AccessLevel=\"3\">\n" +
                "        <DisplayName>Status</DisplayName>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">i=63</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\" IsForward=\"false\">ns=1;i=5029</Reference>\n" +
                "        </References>\n" +
                "    </UAVariable>\n" +
                "    <UAObject ParentNodeId=\"ns=1;i=5004\" NodeId=\"ns=1;i=5007\" BrowseName=\"2:StateMode\">\n" +
                "        <DisplayName>StateMode</DisplayName>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasComponent\">ns=1;i=5017</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\">ns=1;i=5008</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\">ns=1;i=5018</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\">ns=1;i=5009</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\">ns=1;i=5010</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\">ns=1;i=5011</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\">ns=1;i=5013</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\">ns=1;i=5014</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\">ns=1;i=5019</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\">ns=1;i=5020</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\">ns=1;i=5026</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\" IsForward=\"false\">ns=1;i=5004</Reference>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">ns=2;i=1026</Reference>\n" +
                "        </References>\n" +
                "    </UAObject>\n" +
                "    <UAObject ParentNodeId=\"ns=1;i=5007\" NodeId=\"ns=1;i=5017\" BrowseName=\"2:Channel\">\n" +
                "        <DisplayName>Channel</DisplayName>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasComponent\" IsForward=\"false\">ns=1;i=5007</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\">ns=1;i=6018</Reference>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">ns=2;i=1018</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\">ns=1;i=6027</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\">ns=1;i=6019</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\">ns=1;i=6021</Reference>\n" +
                "            <Reference ReferenceType=\"HasProperty\">ns=1;i=6022</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\">ns=1;i=6029</Reference>\n" +
                "        </References>\n" +
                "    </UAObject>\n" +
                "    <UAVariable DataType=\"ChannelStateEnum\" ParentNodeId=\"ns=1;i=5017\" NodeId=\"ns=1;i=6018\" BrowseName=\"2:ChannelState\" AccessLevel=\"3\">\n" +
                "        <DisplayName>ChannelState</DisplayName>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">i=63</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\" IsForward=\"false\">ns=1;i=5017</Reference>\n" +
                "        </References>\n" +
                "    </UAVariable>\n" +
                "    <UAVariable DataType=\"ControlModeEnum\" ParentNodeId=\"ns=1;i=5017\" NodeId=\"ns=1;i=6027\" BrowseName=\"2:ControlMode\" AccessLevel=\"3\">\n" +
                "        <DisplayName>ControlMode</DisplayName>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">i=63</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\" IsForward=\"false\">ns=1;i=5017</Reference>\n" +
                "        </References>\n" +
                "    </UAVariable>\n" +
                "    <UAVariable DataType=\"Double\" ParentNodeId=\"ns=1;i=5017\" NodeId=\"ns=1;i=6019\" BrowseName=\"2:FeedOverride\" AccessLevel=\"3\">\n" +
                "        <DisplayName>FeedOverride</DisplayName>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasProperty\">ns=1;i=6020</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\" IsForward=\"false\">ns=1;i=5017</Reference>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">ns=2;i=2002</Reference>\n" +
                "        </References>\n" +
                "        <Value>\n" +
                "            <uax:Double>0</uax:Double>\n" +
                "        </Value>\n" +
                "    </UAVariable>\n" +
                "    <UAVariable DataType=\"Range\" ParentNodeId=\"ns=1;i=6019\" NodeId=\"ns=1;i=6020\" BrowseName=\"EURange\">\n" +
                "        <DisplayName>EURange</DisplayName>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasProperty\" IsForward=\"false\">ns=1;i=6019</Reference>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">i=68</Reference>\n" +
                "        </References>\n" +
                "    </UAVariable>\n" +
                "    <UAVariable DataType=\"Boolean\" ParentNodeId=\"ns=1;i=5017\" NodeId=\"ns=1;i=6021\" BrowseName=\"2:LeastOneAxisMoving\" AccessLevel=\"3\">\n" +
                "        <DisplayName>LeastOneAxisMoving</DisplayName>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">i=63</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\" IsForward=\"false\">ns=1;i=5017</Reference>\n" +
                "        </References>\n" +
                "    </UAVariable>\n" +
                "    <UAVariable DataType=\"String\" ParentNodeId=\"ns=1;i=5017\" NodeId=\"ns=1;i=6022\" BrowseName=\"2:Name\" AccessLevel=\"3\">\n" +
                "        <DisplayName>Name</DisplayName>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasProperty\" IsForward=\"false\">ns=1;i=5017</Reference>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">i=68</Reference>\n" +
                "        </References>\n" +
                "    </UAVariable>\n" +
                "    <UAVariable DataType=\"Double\" ParentNodeId=\"ns=1;i=5017\" NodeId=\"ns=1;i=6029\" BrowseName=\"2:RapidOverride\" AccessLevel=\"3\">\n" +
                "        <DisplayName>RapidOverride</DisplayName>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasProperty\">ns=1;i=6030</Reference>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">ns=2;i=2002</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\" IsForward=\"false\">ns=1;i=5017</Reference>\n" +
                "        </References>\n" +
                "        <Value>\n" +
                "            <uax:Double>0</uax:Double>\n" +
                "        </Value>\n" +
                "    </UAVariable>\n" +
                "    <UAVariable DataType=\"Range\" ParentNodeId=\"ns=1;i=6029\" NodeId=\"ns=1;i=6030\" BrowseName=\"EURange\">\n" +
                "        <DisplayName>EURange</DisplayName>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasProperty\" IsForward=\"false\">ns=1;i=6029</Reference>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">i=68</Reference>\n" +
                "        </References>\n" +
                "    </UAVariable>\n" +
                "    <UAObject ParentNodeId=\"ns=1;i=5007\" NodeId=\"ns=1;i=5008\" BrowseName=\"2:MachineStateMode\">\n" +
                "        <DisplayName>MachineStateMode</DisplayName>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasComponent\" IsForward=\"false\">ns=1;i=5007</Reference>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">ns=2;i=1028</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\">ns=1;i=6012</Reference>\n" +
                "        </References>\n" +
                "    </UAObject>\n" +
                "    <UAVariable DataType=\"SafetyModeEnum\" ParentNodeId=\"ns=1;i=5008\" NodeId=\"ns=1;i=6012\" BrowseName=\"2:SafetyMode\" AccessLevel=\"3\">\n" +
                "        <DisplayName>SafetyMode</DisplayName>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">i=63</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\" IsForward=\"false\">ns=1;i=5008</Reference>\n" +
                "        </References>\n" +
                "    </UAVariable>\n" +
                "    <UAObject ParentNodeId=\"ns=1;i=5007\" NodeId=\"ns=1;i=5018\" BrowseName=\"2:PlcNc\">\n" +
                "        <DisplayName>PlcNc</DisplayName>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasComponent\">ns=1;i=6023</Reference>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">ns=2;i=1023</Reference>\n" +
                "            <Reference ReferenceType=\"HasProperty\">ns=1;i=6024</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\" IsForward=\"false\">ns=1;i=5007</Reference>\n" +
                "        </References>\n" +
                "    </UAObject>\n" +
                "    <UAVariable DataType=\"ControllerStateEnum\" ParentNodeId=\"ns=1;i=5018\" NodeId=\"ns=1;i=6023\" BrowseName=\"2:ControllerState\" AccessLevel=\"3\">\n" +
                "        <DisplayName>ControllerState</DisplayName>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">i=63</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\" IsForward=\"false\">ns=1;i=5018</Reference>\n" +
                "        </References>\n" +
                "    </UAVariable>\n" +
                "    <UAVariable DataType=\"String\" ParentNodeId=\"ns=1;i=5018\" NodeId=\"ns=1;i=6024\" BrowseName=\"2:Name\" AccessLevel=\"3\">\n" +
                "        <DisplayName>Name</DisplayName>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasProperty\" IsForward=\"false\">ns=1;i=5018</Reference>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">i=68</Reference>\n" +
                "        </References>\n" +
                "    </UAVariable>\n" +
                "    <UAObject ParentNodeId=\"ns=1;i=5007\" NodeId=\"ns=1;i=5009\" BrowseName=\"1:Spindle1\">\n" +
                "        <DisplayName>Spindle1</DisplayName>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasProperty\">ns=1;i=6025</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\" IsForward=\"false\">ns=1;i=5007</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\">ns=1;i=6054</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\">ns=1;i=6013</Reference>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">ns=2;i=1024</Reference>\n" +
                "        </References>\n" +
                "    </UAObject>\n" +
                "    <UAVariable DataType=\"String\" ParentNodeId=\"ns=1;i=5009\" NodeId=\"ns=1;i=6025\" BrowseName=\"2:Name\" AccessLevel=\"3\">\n" +
                "        <DisplayName>Name</DisplayName>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasProperty\" IsForward=\"false\">ns=1;i=5009</Reference>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">i=68</Reference>\n" +
                "        </References>\n" +
                "    </UAVariable>\n" +
                "    <UAVariable DataType=\"Double\" ParentNodeId=\"ns=1;i=5009\" NodeId=\"ns=1;i=6054\" BrowseName=\"2:SpindleOverride\" AccessLevel=\"3\">\n" +
                "        <DisplayName>SpindleOverride</DisplayName>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasProperty\">ns=1;i=6055</Reference>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">ns=2;i=2002</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\" IsForward=\"false\">ns=1;i=5009</Reference>\n" +
                "        </References>\n" +
                "        <Value>\n" +
                "            <uax:Double>0</uax:Double>\n" +
                "        </Value>\n" +
                "    </UAVariable>\n" +
                "    <UAVariable DataType=\"Range\" ParentNodeId=\"ns=1;i=6054\" NodeId=\"ns=1;i=6055\" BrowseName=\"EURange\">\n" +
                "        <DisplayName>EURange</DisplayName>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasProperty\" IsForward=\"false\">ns=1;i=6054</Reference>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">i=68</Reference>\n" +
                "        </References>\n" +
                "    </UAVariable>\n" +
                "    <UAVariable DataType=\"Double\" ParentNodeId=\"ns=1;i=5009\" NodeId=\"ns=1;i=6013\" BrowseName=\"2:SpindleRotationSpeed\" AccessLevel=\"3\">\n" +
                "        <DisplayName>SpindleRotationSpeed</DisplayName>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">i=63</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\" IsForward=\"false\">ns=1;i=5009</Reference>\n" +
                "        </References>\n" +
                "    </UAVariable>\n" +
                "    <UAObject ParentNodeId=\"ns=1;i=5007\" NodeId=\"ns=1;i=5010\" BrowseName=\"1:Spindle2\">\n" +
                "        <DisplayName>Spindle2</DisplayName>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasProperty\">ns=1;i=6031</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\" IsForward=\"false\">ns=1;i=5007</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\">ns=1;i=6056</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\">ns=1;i=6026</Reference>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">ns=2;i=1024</Reference>\n" +
                "        </References>\n" +
                "    </UAObject>\n" +
                "    <UAVariable DataType=\"String\" ParentNodeId=\"ns=1;i=5010\" NodeId=\"ns=1;i=6031\" BrowseName=\"2:Name\" AccessLevel=\"3\">\n" +
                "        <DisplayName>Name</DisplayName>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasProperty\" IsForward=\"false\">ns=1;i=5010</Reference>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">i=68</Reference>\n" +
                "        </References>\n" +
                "    </UAVariable>\n" +
                "    <UAVariable DataType=\"Double\" ParentNodeId=\"ns=1;i=5010\" NodeId=\"ns=1;i=6056\" BrowseName=\"2:SpindleOverride\" AccessLevel=\"3\">\n" +
                "        <DisplayName>SpindleOverride</DisplayName>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasProperty\">ns=1;i=6057</Reference>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">ns=2;i=2002</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\" IsForward=\"false\">ns=1;i=5010</Reference>\n" +
                "        </References>\n" +
                "        <Value>\n" +
                "            <uax:Double>0</uax:Double>\n" +
                "        </Value>\n" +
                "    </UAVariable>\n" +
                "    <UAVariable DataType=\"Range\" ParentNodeId=\"ns=1;i=6056\" NodeId=\"ns=1;i=6057\" BrowseName=\"EURange\">\n" +
                "        <DisplayName>EURange</DisplayName>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasProperty\" IsForward=\"false\">ns=1;i=6056</Reference>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">i=68</Reference>\n" +
                "        </References>\n" +
                "    </UAVariable>\n" +
                "    <UAVariable DataType=\"Double\" ParentNodeId=\"ns=1;i=5010\" NodeId=\"ns=1;i=6026\" BrowseName=\"2:SpindleRotationSpeed\" AccessLevel=\"3\">\n" +
                "        <DisplayName>SpindleRotationSpeed</DisplayName>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">i=63</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\" IsForward=\"false\">ns=1;i=5010</Reference>\n" +
                "        </References>\n" +
                "    </UAVariable>\n" +
                "    <UAObject ParentNodeId=\"ns=1;i=5007\" NodeId=\"ns=1;i=5011\" BrowseName=\"1:Spindle3\">\n" +
                "        <DisplayName>Spindle3</DisplayName>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasProperty\">ns=1;i=6033</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\" IsForward=\"false\">ns=1;i=5007</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\">ns=1;i=6058</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\">ns=1;i=6032</Reference>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">ns=2;i=1024</Reference>\n" +
                "        </References>\n" +
                "    </UAObject>\n" +
                "    <UAVariable DataType=\"String\" ParentNodeId=\"ns=1;i=5011\" NodeId=\"ns=1;i=6033\" BrowseName=\"2:Name\" AccessLevel=\"3\">\n" +
                "        <DisplayName>Name</DisplayName>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasProperty\" IsForward=\"false\">ns=1;i=5011</Reference>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">i=68</Reference>\n" +
                "        </References>\n" +
                "    </UAVariable>\n" +
                "    <UAVariable DataType=\"Double\" ParentNodeId=\"ns=1;i=5011\" NodeId=\"ns=1;i=6058\" BrowseName=\"2:SpindleOverride\" AccessLevel=\"3\">\n" +
                "        <DisplayName>SpindleOverride</DisplayName>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasProperty\">ns=1;i=6059</Reference>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">ns=2;i=2002</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\" IsForward=\"false\">ns=1;i=5011</Reference>\n" +
                "        </References>\n" +
                "        <Value>\n" +
                "            <uax:Double>0</uax:Double>\n" +
                "        </Value>\n" +
                "    </UAVariable>\n" +
                "    <UAVariable DataType=\"Range\" ParentNodeId=\"ns=1;i=6058\" NodeId=\"ns=1;i=6059\" BrowseName=\"EURange\">\n" +
                "        <DisplayName>EURange</DisplayName>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasProperty\" IsForward=\"false\">ns=1;i=6058</Reference>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">i=68</Reference>\n" +
                "        </References>\n" +
                "    </UAVariable>\n" +
                "    <UAVariable DataType=\"Double\" ParentNodeId=\"ns=1;i=5011\" NodeId=\"ns=1;i=6032\" BrowseName=\"2:SpindleRotationSpeed\" AccessLevel=\"3\">\n" +
                "        <DisplayName>SpindleRotationSpeed</DisplayName>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">i=63</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\" IsForward=\"false\">ns=1;i=5011</Reference>\n" +
                "        </References>\n" +
                "    </UAVariable>\n" +
                "    <UAObject ParentNodeId=\"ns=1;i=5007\" NodeId=\"ns=1;i=5013\" BrowseName=\"1:Spindle4\">\n" +
                "        <DisplayName>Spindle4</DisplayName>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasProperty\">ns=1;i=6035</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\" IsForward=\"false\">ns=1;i=5007</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\">ns=1;i=6060</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\">ns=1;i=6034</Reference>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">ns=2;i=1024</Reference>\n" +
                "        </References>\n" +
                "    </UAObject>\n" +
                "    <UAVariable DataType=\"String\" ParentNodeId=\"ns=1;i=5013\" NodeId=\"ns=1;i=6035\" BrowseName=\"2:Name\" AccessLevel=\"3\">\n" +
                "        <DisplayName>Name</DisplayName>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasProperty\" IsForward=\"false\">ns=1;i=5013</Reference>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">i=68</Reference>\n" +
                "        </References>\n" +
                "    </UAVariable>\n" +
                "    <UAVariable DataType=\"Double\" ParentNodeId=\"ns=1;i=5013\" NodeId=\"ns=1;i=6060\" BrowseName=\"2:SpindleOverride\" AccessLevel=\"3\">\n" +
                "        <DisplayName>SpindleOverride</DisplayName>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasProperty\">ns=1;i=6061</Reference>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">ns=2;i=2002</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\" IsForward=\"false\">ns=1;i=5013</Reference>\n" +
                "        </References>\n" +
                "        <Value>\n" +
                "            <uax:Double>0</uax:Double>\n" +
                "        </Value>\n" +
                "    </UAVariable>\n" +
                "    <UAVariable DataType=\"Range\" ParentNodeId=\"ns=1;i=6060\" NodeId=\"ns=1;i=6061\" BrowseName=\"EURange\">\n" +
                "        <DisplayName>EURange</DisplayName>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasProperty\" IsForward=\"false\">ns=1;i=6060</Reference>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">i=68</Reference>\n" +
                "        </References>\n" +
                "    </UAVariable>\n" +
                "    <UAVariable DataType=\"Double\" ParentNodeId=\"ns=1;i=5013\" NodeId=\"ns=1;i=6034\" BrowseName=\"2:SpindleRotationSpeed\" AccessLevel=\"3\">\n" +
                "        <DisplayName>SpindleRotationSpeed</DisplayName>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">i=63</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\" IsForward=\"false\">ns=1;i=5013</Reference>\n" +
                "        </References>\n" +
                "    </UAVariable>\n" +
                "    <UAObject ParentNodeId=\"ns=1;i=5007\" NodeId=\"ns=1;i=5014\" BrowseName=\"1:Spindle5\">\n" +
                "        <DisplayName>Spindle5</DisplayName>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasProperty\">ns=1;i=6043</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\" IsForward=\"false\">ns=1;i=5007</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\">ns=1;i=6062</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\">ns=1;i=6042</Reference>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">ns=2;i=1024</Reference>\n" +
                "        </References>\n" +
                "    </UAObject>\n" +
                "    <UAVariable DataType=\"String\" ParentNodeId=\"ns=1;i=5014\" NodeId=\"ns=1;i=6043\" BrowseName=\"2:Name\" AccessLevel=\"3\">\n" +
                "        <DisplayName>Name</DisplayName>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasProperty\" IsForward=\"false\">ns=1;i=5014</Reference>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">i=68</Reference>\n" +
                "        </References>\n" +
                "    </UAVariable>\n" +
                "    <UAVariable DataType=\"Double\" ParentNodeId=\"ns=1;i=5014\" NodeId=\"ns=1;i=6062\" BrowseName=\"2:SpindleOverride\" AccessLevel=\"3\">\n" +
                "        <DisplayName>SpindleOverride</DisplayName>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasProperty\">ns=1;i=6063</Reference>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">ns=2;i=2002</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\" IsForward=\"false\">ns=1;i=5014</Reference>\n" +
                "        </References>\n" +
                "        <Value>\n" +
                "            <uax:Double>0</uax:Double>\n" +
                "        </Value>\n" +
                "    </UAVariable>\n" +
                "    <UAVariable DataType=\"Range\" ParentNodeId=\"ns=1;i=6062\" NodeId=\"ns=1;i=6063\" BrowseName=\"EURange\">\n" +
                "        <DisplayName>EURange</DisplayName>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasProperty\" IsForward=\"false\">ns=1;i=6062</Reference>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">i=68</Reference>\n" +
                "        </References>\n" +
                "    </UAVariable>\n" +
                "    <UAVariable DataType=\"Double\" ParentNodeId=\"ns=1;i=5014\" NodeId=\"ns=1;i=6042\" BrowseName=\"2:SpindleRotationSpeed\" AccessLevel=\"3\">\n" +
                "        <DisplayName>SpindleRotationSpeed</DisplayName>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">i=63</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\" IsForward=\"false\">ns=1;i=5014</Reference>\n" +
                "        </References>\n" +
                "    </UAVariable>\n" +
                "    <UAObject ParentNodeId=\"ns=1;i=5007\" NodeId=\"ns=1;i=5019\" BrowseName=\"1:Spindle6\">\n" +
                "        <DisplayName>Spindle6</DisplayName>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasProperty\">ns=1;i=6049</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\" IsForward=\"false\">ns=1;i=5007</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\">ns=1;i=6064</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\">ns=1;i=6044</Reference>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">ns=2;i=1024</Reference>\n" +
                "        </References>\n" +
                "    </UAObject>\n" +
                "    <UAVariable DataType=\"String\" ParentNodeId=\"ns=1;i=5019\" NodeId=\"ns=1;i=6049\" BrowseName=\"2:Name\" AccessLevel=\"3\">\n" +
                "        <DisplayName>Name</DisplayName>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasProperty\" IsForward=\"false\">ns=1;i=5019</Reference>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">i=68</Reference>\n" +
                "        </References>\n" +
                "    </UAVariable>\n" +
                "    <UAVariable DataType=\"Double\" ParentNodeId=\"ns=1;i=5019\" NodeId=\"ns=1;i=6064\" BrowseName=\"2:SpindleOverride\" AccessLevel=\"3\">\n" +
                "        <DisplayName>SpindleOverride</DisplayName>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasProperty\">ns=1;i=6065</Reference>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">ns=2;i=2002</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\" IsForward=\"false\">ns=1;i=5019</Reference>\n" +
                "        </References>\n" +
                "        <Value>\n" +
                "            <uax:Double>0</uax:Double>\n" +
                "        </Value>\n" +
                "    </UAVariable>\n" +
                "    <UAVariable DataType=\"Range\" ParentNodeId=\"ns=1;i=6064\" NodeId=\"ns=1;i=6065\" BrowseName=\"EURange\">\n" +
                "        <DisplayName>EURange</DisplayName>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasProperty\" IsForward=\"false\">ns=1;i=6064</Reference>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">i=68</Reference>\n" +
                "        </References>\n" +
                "    </UAVariable>\n" +
                "    <UAVariable DataType=\"Double\" ParentNodeId=\"ns=1;i=5019\" NodeId=\"ns=1;i=6044\" BrowseName=\"2:SpindleRotationSpeed\" AccessLevel=\"3\">\n" +
                "        <DisplayName>SpindleRotationSpeed</DisplayName>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">i=63</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\" IsForward=\"false\">ns=1;i=5019</Reference>\n" +
                "        </References>\n" +
                "    </UAVariable>\n" +
                "    <UAObject ParentNodeId=\"ns=1;i=5007\" NodeId=\"ns=1;i=5020\" BrowseName=\"1:Spindle7\">\n" +
                "        <DisplayName>Spindle7</DisplayName>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasProperty\">ns=1;i=6051</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\" IsForward=\"false\">ns=1;i=5007</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\">ns=1;i=6066</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\">ns=1;i=6050</Reference>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">ns=2;i=1024</Reference>\n" +
                "        </References>\n" +
                "    </UAObject>\n" +
                "    <UAVariable DataType=\"String\" ParentNodeId=\"ns=1;i=5020\" NodeId=\"ns=1;i=6051\" BrowseName=\"2:Name\" AccessLevel=\"3\">\n" +
                "        <DisplayName>Name</DisplayName>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasProperty\" IsForward=\"false\">ns=1;i=5020</Reference>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">i=68</Reference>\n" +
                "        </References>\n" +
                "    </UAVariable>\n" +
                "    <UAVariable DataType=\"Double\" ParentNodeId=\"ns=1;i=5020\" NodeId=\"ns=1;i=6066\" BrowseName=\"2:SpindleOverride\" AccessLevel=\"3\">\n" +
                "        <DisplayName>SpindleOverride</DisplayName>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasProperty\">ns=1;i=6067</Reference>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">ns=2;i=2002</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\" IsForward=\"false\">ns=1;i=5020</Reference>\n" +
                "        </References>\n" +
                "        <Value>\n" +
                "            <uax:Double>0</uax:Double>\n" +
                "        </Value>\n" +
                "    </UAVariable>\n" +
                "    <UAVariable DataType=\"Range\" ParentNodeId=\"ns=1;i=6066\" NodeId=\"ns=1;i=6067\" BrowseName=\"EURange\">\n" +
                "        <DisplayName>EURange</DisplayName>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasProperty\" IsForward=\"false\">ns=1;i=6066</Reference>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">i=68</Reference>\n" +
                "        </References>\n" +
                "    </UAVariable>\n" +
                "    <UAVariable DataType=\"Double\" ParentNodeId=\"ns=1;i=5020\" NodeId=\"ns=1;i=6050\" BrowseName=\"2:SpindleRotationSpeed\" AccessLevel=\"3\">\n" +
                "        <DisplayName>SpindleRotationSpeed</DisplayName>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">i=63</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\" IsForward=\"false\">ns=1;i=5020</Reference>\n" +
                "        </References>\n" +
                "    </UAVariable>\n" +
                "    <UAObject ParentNodeId=\"ns=1;i=5007\" NodeId=\"ns=1;i=5026\" BrowseName=\"1:Spindle8\">\n" +
                "        <DisplayName>Spindle8</DisplayName>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasProperty\">ns=1;i=6053</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\" IsForward=\"false\">ns=1;i=5007</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\">ns=1;i=6068</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\">ns=1;i=6052</Reference>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">ns=2;i=1024</Reference>\n" +
                "        </References>\n" +
                "    </UAObject>\n" +
                "    <UAVariable DataType=\"String\" ParentNodeId=\"ns=1;i=5026\" NodeId=\"ns=1;i=6053\" BrowseName=\"2:Name\" AccessLevel=\"3\">\n" +
                "        <DisplayName>Name</DisplayName>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasProperty\" IsForward=\"false\">ns=1;i=5026</Reference>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">i=68</Reference>\n" +
                "        </References>\n" +
                "    </UAVariable>\n" +
                "    <UAVariable DataType=\"Double\" ParentNodeId=\"ns=1;i=5026\" NodeId=\"ns=1;i=6068\" BrowseName=\"2:SpindleOverride\" AccessLevel=\"3\">\n" +
                "        <DisplayName>SpindleOverride</DisplayName>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasProperty\">ns=1;i=6070</Reference>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">ns=2;i=2002</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\" IsForward=\"false\">ns=1;i=5026</Reference>\n" +
                "        </References>\n" +
                "        <Value>\n" +
                "            <uax:Double>0</uax:Double>\n" +
                "        </Value>\n" +
                "    </UAVariable>\n" +
                "    <UAVariable DataType=\"Range\" ParentNodeId=\"ns=1;i=6068\" NodeId=\"ns=1;i=6070\" BrowseName=\"EURange\">\n" +
                "        <DisplayName>EURange</DisplayName>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasProperty\" IsForward=\"false\">ns=1;i=6068</Reference>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">i=68</Reference>\n" +
                "        </References>\n" +
                "    </UAVariable>\n" +
                "    <UAVariable DataType=\"Double\" ParentNodeId=\"ns=1;i=5026\" NodeId=\"ns=1;i=6052\" BrowseName=\"2:SpindleRotationSpeed\" AccessLevel=\"3\">\n" +
                "        <DisplayName>SpindleRotationSpeed</DisplayName>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">i=63</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\" IsForward=\"false\">ns=1;i=5026</Reference>\n" +
                "        </References>\n" +
                "    </UAVariable>\n" +
                "    <UAObject ParentNodeId=\"ns=1;i=5002\" NodeId=\"ns=1;i=5030\" BrowseName=\"2:Notification\">\n" +
                "        <DisplayName>Notification</DisplayName>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasComponent\">ns=1;i=5031</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\" IsForward=\"false\">ns=1;i=5002</Reference>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">ns=2;i=1008</Reference>\n" +
                "        </References>\n" +
                "    </UAObject>\n" +
                "    <UAObject ParentNodeId=\"ns=1;i=5030\" EventNotifier=\"1\" NodeId=\"ns=1;i=5031\" BrowseName=\"2:Alerts\">\n" +
                "        <DisplayName>Alerts</DisplayName>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasComponent\" IsForward=\"false\">ns=1;i=5030</Reference>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">ns=2;i=1020</Reference>\n" +
                "            <Reference ReferenceType=\"GeneratesEvent\">ns=2;i=1042</Reference>\n" +
                "        </References>\n" +
                "    </UAObject>\n" +
                "    <UAObject ParentNodeId=\"ns=1;i=5002\" NodeId=\"ns=1;i=5012\" BrowseName=\"2:ProductionPlan\">\n" +
                "        <DisplayName>ProductionPlan</DisplayName>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasComponent\">ns=1;i=5021</Reference>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">ns=2;i=1032</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\" IsForward=\"false\">ns=1;i=5002</Reference>\n" +
                "        </References>\n" +
                "    </UAObject>\n" +
                "    <UAObject ParentNodeId=\"ns=1;i=5012\" NodeId=\"ns=1;i=5021\" BrowseName=\"1:Job\">\n" +
                "        <DisplayName>Job</DisplayName>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasProperty\">ns=1;i=6036</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\" IsForward=\"false\">ns=1;i=5012</Reference>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">ns=2;i=1031</Reference>\n" +
                "            <Reference ReferenceType=\"HasProperty\">ns=1;i=6039</Reference>\n" +
                "            <Reference ReferenceType=\"HasProperty\">ns=1;i=6040</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\">ns=1;i=5023</Reference>\n" +
                "        </References>\n" +
                "    </UAObject>\n" +
                "    <UAVariable DataType=\"String\" ParentNodeId=\"ns=1;i=5021\" NodeId=\"ns=1;i=6036\" BrowseName=\"2:Identifier\" AccessLevel=\"3\">\n" +
                "        <DisplayName>Identifier</DisplayName>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasProperty\" IsForward=\"false\">ns=1;i=5021</Reference>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">i=68</Reference>\n" +
                "        </References>\n" +
                "    </UAVariable>\n" +
                "    <UAVariable DataType=\"UInt32\" ParentNodeId=\"ns=1;i=5021\" NodeId=\"ns=1;i=6039\" BrowseName=\"2:RunsCompleted\" AccessLevel=\"3\">\n" +
                "        <DisplayName>RunsCompleted</DisplayName>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">i=68</Reference>\n" +
                "            <Reference ReferenceType=\"HasProperty\" IsForward=\"false\">ns=1;i=5021</Reference>\n" +
                "        </References>\n" +
                "    </UAVariable>\n" +
                "    <UAVariable DataType=\"UInt32\" ParentNodeId=\"ns=1;i=5021\" NodeId=\"ns=1;i=6040\" BrowseName=\"2:RunsPlanned\" AccessLevel=\"3\">\n" +
                "        <DisplayName>RunsPlanned</DisplayName>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">i=68</Reference>\n" +
                "            <Reference ReferenceType=\"HasProperty\" IsForward=\"false\">ns=1;i=5021</Reference>\n" +
                "        </References>\n" +
                "    </UAVariable>\n" +
                "    <UAObject ParentNodeId=\"ns=1;i=5021\" NodeId=\"ns=1;i=5023\" BrowseName=\"2:State\">\n" +
                "        <DisplayName>State</DisplayName>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasComponent\">ns=1;i=6041</Reference>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">ns=2;i=1030</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\" IsForward=\"false\">ns=1;i=5021</Reference>\n" +
                "        </References>\n" +
                "    </UAObject>\n" +
                "    <UAVariable DataType=\"LocalizedText\" ParentNodeId=\"ns=1;i=5023\" NodeId=\"ns=1;i=6041\" BrowseName=\"2:CurrentState\">\n" +
                "        <DisplayName>CurrentState</DisplayName>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">i=63</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\" IsForward=\"false\">ns=1;i=5023</Reference>\n" +
                "            <Reference ReferenceType=\"HasProperty\">ns=1;i=6045</Reference>\n" +
                "        </References>\n" +
                "        <Value>\n" +
                "            <uax:LocalizedText/>\n" +
                "        </Value>\n" +
                "    </UAVariable>\n" +
                "    <UAVariable DataType=\"UInt32\" ParentNodeId=\"ns=1;i=6041\" NodeId=\"ns=1;i=6045\" BrowseName=\"2:Number\" AccessLevel=\"3\">\n" +
                "        <DisplayName>Number</DisplayName>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasProperty\" IsForward=\"false\">ns=1;i=6041</Reference>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">i=68</Reference>\n" +
                "        </References>\n" +
                "    </UAVariable>\n" +
                "    <UAObject ParentNodeId=\"ns=1;i=5002\" NodeId=\"ns=1;i=5022\" BrowseName=\"2:ToolManagement\">\n" +
                "        <DisplayName>ToolManagement</DisplayName>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasComponent\" IsForward=\"false\">ns=1;i=5002</Reference>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">ns=2;i=1013</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\">ns=1;i=5024</Reference>\n" +
                "        </References>\n" +
                "    </UAObject>\n" +
                "    <UAObject ParentNodeId=\"ns=1;i=5022\" NodeId=\"ns=1;i=5024\" BrowseName=\"2:Tools\">\n" +
                "        <DisplayName>Tools</DisplayName>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasComponent\">ns=1;i=5025</Reference>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">ns=2;i=1049</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\" IsForward=\"false\">ns=1;i=5022</Reference>\n" +
                "        </References>\n" +
                "    </UAObject>\n" +
                "    <UAObject ParentNodeId=\"ns=1;i=5024\" NodeId=\"ns=1;i=5025\" BrowseName=\"1:Tool\">\n" +
                "        <DisplayName>Tool</DisplayName>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasComponent\">ns=1;i=6037</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\">ns=1;i=6038</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\">ns=1;i=6082</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\">ns=1;i=6046</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\" IsForward=\"false\">ns=1;i=5024</Reference>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">ns=2;i=1056</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\">ns=1;i=6047</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\">ns=1;i=6048</Reference>\n" +
                "        </References>\n" +
                "    </UAObject>\n" +
                "    <UAVariable DataType=\"Boolean\" ParentNodeId=\"ns=1;i=5025\" NodeId=\"ns=1;i=6037\" BrowseName=\"2:Active\" AccessLevel=\"3\">\n" +
                "        <DisplayName>Active</DisplayName>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasComponent\" IsForward=\"false\">ns=1;i=5025</Reference>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">i=63</Reference>\n" +
                "        </References>\n" +
                "    </UAVariable>\n" +
                "    <UAVariable DataType=\"Int32\" ParentNodeId=\"ns=1;i=5025\" NodeId=\"ns=1;i=6038\" BrowseName=\"2:Duplonumber\" AccessLevel=\"3\">\n" +
                "        <DisplayName>Duplonumber</DisplayName>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">i=63</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\" IsForward=\"false\">ns=1;i=5025</Reference>\n" +
                "        </References>\n" +
                "    </UAVariable>\n" +
                "    <UAVariable DataType=\"UtcTime\" ParentNodeId=\"ns=1;i=5025\" NodeId=\"ns=1;i=6082\" BrowseName=\"2:LastUsage\" AccessLevel=\"3\">\n" +
                "        <DisplayName>LastUsage</DisplayName>\n" +
                "        <Description Locale=\"de\">Dieses Werkzeug ist im aktuellen Auftrag zur Verwendung eingeplant\n" +
                "            (üblicherweise eines von mehreren Duplowerkzeugen)</Description>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">i=63</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\" IsForward=\"false\">ns=1;i=5025</Reference>\n" +
                "        </References>\n" +
                "    </UAVariable>\n" +
                "    <UAVariable DataType=\"Boolean\" ParentNodeId=\"ns=1;i=5025\" NodeId=\"ns=1;i=6046\" BrowseName=\"2:Locked\" AccessLevel=\"3\">\n" +
                "        <DisplayName>Locked</DisplayName>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">i=63</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\" IsForward=\"false\">ns=1;i=5025</Reference>\n" +
                "        </References>\n" +
                "    </UAVariable>\n" +
                "    <UAVariable DataType=\"String\" ParentNodeId=\"ns=1;i=5025\" NodeId=\"ns=1;i=6047\" BrowseName=\"2:TypeId\" AccessLevel=\"3\">\n" +
                "        <DisplayName>TypeId</DisplayName>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">i=63</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\" IsForward=\"false\">ns=1;i=5025</Reference>\n" +
                "        </References>\n" +
                "    </UAVariable>\n" +
                "    <UAVariable DataType=\"String\" ParentNodeId=\"ns=1;i=5025\" NodeId=\"ns=1;i=6048\" BrowseName=\"2:UniqueId\" AccessLevel=\"3\">\n" +
                "        <DisplayName>UniqueId</DisplayName>\n" +
                "        <References>\n" +
                "            <Reference ReferenceType=\"HasTypeDefinition\">i=63</Reference>\n" +
                "            <Reference ReferenceType=\"HasComponent\" IsForward=\"false\">ns=1;i=5025</Reference>\n" +
                "        </References>\n" +
                "    </UAVariable>\n" +
                "</UANodeSet>\n";
        return nodeSetXml;
    }

}
