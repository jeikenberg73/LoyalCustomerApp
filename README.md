# Loyal Customer Application

The purpose of this application is to take a folder that contains log files from a web site in it and cycle through them to produce a list of loyal customers. A loyal customer is defined as a customer that has visited the web site twice over two days and has visited more than one web page on the site.

Log Files:

This application relys on a folder with multiple log files in it. Each log file should contain lines that represent a customer visiting a page in the web site. Each line will contain a date and time stamp, a customer id, and the page id of the page visited. The following will be the format of each of the logs in the log file.

[MM/DD/YYYY] [HH:mm:ss];[Customer ID as an integer];[Page ID as an integer]

Each log file will be a days worth of logs for the web site.

How to use the application:

1. 	Use ```getLoyalCustomersList(String[] args)``` to create a list of loyal customers. Pass into the first position of the args array the path that the log folder containing the log files is located. The list is a ```List<Integer>```.
2.  Use ```generateReport(List<Integer> loyalCustomerIds, String fileName, String path)``` to create a  report with the list of loyal customers. Pass in the loyal customer list, a name for the report, and the path. The application will create a folder with the name and path provided and produce the report in that folder.
