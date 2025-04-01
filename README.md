# Loyal Customer Application

The purpose of this application is to take a folder that contains log files from a web site in it and cycle through them to produce a list of loyal customers. A loyal customer is defined as a customer that has visited the web site twice over two days and has visited more than one web page on the site.

Log Files:

This application relys on a folder with multiple log files in it. Each log file should contain lines that represent a customer visiting a page in the web site. Each line will contain a date and time stamp, a customer id, and the page id of the page visited. The following will be the format of each of the logs in the log file.

[MM/DD/YYYY] [HH:mm:ss];[Customer ID as an integer];[Page ID as an integer]

Each log file will be a days worth of logs for the web site.

How to use the application:

1. 	Compile the application into an executable.
2.	As a command console parameter provide a path to the folder holding the log files.
3. 	The application will then provide a text file with a list of the customers IDs associated to the customers that were loyal. The location of the file will be in the location and name provided to the generateReport method of the used to create the report.
	
