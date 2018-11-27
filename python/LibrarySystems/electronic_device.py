class ElectronicDevice:
    def __init__(self, location, available):
        self.location = location
        self.available = available
    # This class represents an electronic device

    def get_location(self):
        return self.location
    # Returns the device location in the library

    def set_location(self, location):
        self.location = location
    # Sets location to given value

    def get_available(self):
        return self.available
    # Returns if the device is available

    def set_available(self, available):
        self.available = available
    # Sets availability of the device

    def print_device_details(self):
        print("The location of this book is: " + str(self.location))
        print("The availability  of this book is: " + str(self.available))
    # Prints location and availability of device





