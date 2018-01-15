package ch.weilbaum.abu_varcremote;

import android.util.Log;

public class Bluetooth {
    /**
     * List of paired devices.
     */
    public void getListOfPairedDevices() {
        Log.d("wd", "wd");
        /*
        BluetoothAdapter bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
        // getting list of devies which are already paired with our device
        Set<BluetoothDevice> pairedDevice = bluetoothAdapter.getBondedDevices();
        if (pairedDevice.size() > 0) {
            for (BluetoothDevice device : pairedDevice) {
                // device name
                String deviceName = device.getName();
                // device mac address
                String deviceHardwareAddress = device.getAddress();
                Log.e("BT", "Device name:" + deviceName + "Device Hardware/MAC Address:" + deviceHardwareAddress);
            }
        }
        */
    }
}